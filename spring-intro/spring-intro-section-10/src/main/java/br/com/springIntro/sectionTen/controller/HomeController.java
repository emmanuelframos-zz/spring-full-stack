package br.com.springIntro.sectionTen.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.springIntro.sectionTen.bean.Offer;
import br.com.springIntro.sectionTen.dao.IOfferDao;

@Controller
public class HomeController {
    
    @Autowired
    private IOfferDao offerDao;    
    
    @RequestMapping("/")
    public String showHome(){	
	return "home";
    }
    
    @RequestMapping("/logon")
    public String logon(){	
	return "logon";
    }
    
    @RequestMapping("/createOffer")
    public String createOffer(){	
	return "createOffer";
    }
    
    @RequestMapping("/saveOffer")
    public String saveOffer(HttpServletRequest request){
	Offer offer = Offer.build()
		.name(request.getParameter("name"))
		.email(request.getParameter("email"))
		.text(request.getParameter("text"));
	
	offerDao.createOffer(offer);
	
	return "home";
    }
    
    @RequestMapping(value="/showOffers")
    public ModelAndView showOffers(){	
	ModelAndView mv = new ModelAndView("showOffers");
	
	Map<String, Object> params = mv.getModel();
	params.put("offers", offerDao.showOffers());	
	
	return mv;	
    }   
}