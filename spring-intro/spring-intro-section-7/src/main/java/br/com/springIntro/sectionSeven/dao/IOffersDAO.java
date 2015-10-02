package br.com.springIntro.sectionSeven.dao;

import java.util.List;

import br.com.springIntro.sectionSeven.entity.Offer;

public interface IOffersDAO {

    List<Offer> getOffers();
    
    int[] createOffers(List<Offer> offers);
    
}