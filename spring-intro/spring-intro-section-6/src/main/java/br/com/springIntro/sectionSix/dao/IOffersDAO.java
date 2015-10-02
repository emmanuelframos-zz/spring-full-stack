package br.com.springIntro.sectionSix.dao;

import java.util.List;

import br.com.springIntro.sectionSix.entity.Offer;

public interface IOffersDAO {

    List<Offer> getOffers();
    
    int[] createOffers(List<Offer> offers);
    
}