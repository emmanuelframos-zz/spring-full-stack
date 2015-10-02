package br.com.springIntro.sectionSix.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import br.com.springIntro.sectionSix.entity.Offer;

@Component
public class OffersDAO implements IOffersDAO {
    
    /** Strongly recommended to use NamedParameterJdbcTemplate **/
    private NamedParameterJdbcTemplate jdbcTemplate;
    
    public List<Offer> getOffers(){	
	return jdbcTemplate.query("select * from offers", new RowMapper<Offer>(){
	    public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Offer offer = Offer.build()
			.id(rs.getInt("id"))
			.name(rs.getString("name"))
			.email(rs.getString("email"))
			.text(rs.getString("text"));
		return offer;
	    }	    
	});
    }
    
    @Transactional(isolation=Isolation.READ_COMMITTED)
    public int[] createOffers(List<Offer> offers) {
	SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(offers.toArray()); 
	return jdbcTemplate.batchUpdate("insert into offers (name, email, text) values (:name, :email, :text)", params);
    } 
    
    @Autowired
    public void setDataSource(DataSource dataSource){
	this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }   
}