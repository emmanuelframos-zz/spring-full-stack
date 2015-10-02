package br.com.springIntro.sectionSeven.controller;



import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.springIntro.sectionSeven.dao.IOffersDAO;

@Controller
public class HomeController {
    
    @Autowired
    private IOffersDAO offersDAO;
    
    @RequestMapping("/home")
    public String showHome(Model model){
	model.addAttribute("name", "Darth Vader");
	return "home";
    }
    
    @RequestMapping("/homeMap")
    public ModelAndView showHomeMap(){
	ModelAndView mv = new ModelAndView("homeMap");
	
	Map<String, Object> params = mv.getModel();
	params.put("name", "Luke Skywalker");
	
	return mv;
    }
    
    @RequestMapping("/homeQuery")
    public ModelAndView showHomeQuery(){
	ModelAndView mv = new ModelAndView("homeQuery");
	
	Map<String, Object> params = mv.getModel();
	params.put("offers", offersDAO.getOffers());	
	
	return mv;
    }
}