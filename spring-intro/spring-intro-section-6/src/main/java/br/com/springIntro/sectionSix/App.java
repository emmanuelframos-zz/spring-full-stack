package br.com.springIntro.sectionSix;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.springIntro.sectionSix.dao.IOffersDAO;
import br.com.springIntro.sectionSix.entity.Offer;

public class App {

    public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");	
	
	IOffersDAO dao = (IOffersDAO)context.getBean("offersDAO");
	
	List<Offer> offers = new ArrayList<Offer>();
	Offer offer1 = Offer
		.build()
		.name("Dart")
		.email("dart@sw.com")
		.text("I´m your father!");
	offers.add(offer1);
	
	Offer offer2 = Offer
		.build()
		.name("Chewie")
		.email("chewie@sw.com")
		.text("ArrrrrrghhhH!");	
	offers.add(offer2);
	
	int[] rows = dao.createOffers(offers);
	System.out.println("Updated " + rows.length + " rows.");
		
	for (Offer offer :  dao.getOffers()){
	    System.out.println(offer.toString()); 
	}
		
	context.close();
    }
}