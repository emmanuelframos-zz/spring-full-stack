package br.com.springIntro.sectionTen.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import br.com.springIntro.sectionTen.bean.Offer;

@Component
public class OfferDao implements IOfferDao {    
    
    /** Strongly recommended to use NamedParameterJdbcTemplate **/
    @Autowired
    @Qualifier("namedParameterJdbcTemplate")
    private NamedParameterJdbcTemplate jdbcTemplate;
 
    @Transactional(isolation=Isolation.READ_COMMITTED)
    public boolean createOffer(Offer offer) {	
	String sql = "insert into offers (name, email, text) values (:name, :email, :text)";
	
	Map<String, Object> params = new HashMap<String, Object>();
	params.put("name", offer.getName());
	params.put("email", offer.getEmail());
	params.put("text", offer.getText());
	
	return jdbcTemplate.update(sql, params) > 0;
    }
    
    @Transactional( readOnly = true )
    public List<Offer> showOffers() {	
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
}