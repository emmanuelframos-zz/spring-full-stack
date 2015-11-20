package br.com.springIntro.sectionTen.dao;

import java.util.List;

import br.com.springIntro.sectionTen.bean.Offer;

public interface IOfferDao {
    
    boolean createOffer(Offer offer);
    
    List<Offer> showOffers();
}