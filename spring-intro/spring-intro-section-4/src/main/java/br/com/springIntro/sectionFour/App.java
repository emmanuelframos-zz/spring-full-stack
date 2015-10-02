package br.com.springIntro.sectionFour;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    
    public static void main(String[] args) {
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	 Logger logger = (Logger) context.getBean("logger");
	 logger.writeConsole("Dummy console log.");
	 logger.writeFile("Dummy file log.");	
	 
	 context.close();
    }
}