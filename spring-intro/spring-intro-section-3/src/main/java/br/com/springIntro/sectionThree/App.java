package br.com.springIntro.sectionThree;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	 LoggerByType loggerByType = (LoggerByType) context.getBean("loggerByType");
	 loggerByType.writeConsole("Dummy console log.");
	 loggerByType.writeFile("Dummy file log.");
	 
	 LoggerByName loggerByName = (LoggerByName) context.getBean("loggerByName");
	 loggerByName.writeConsole("Dummy console log.");
	 loggerByName.writeFile("Dummy file log.");
	 
	 LoggerByConstructor loggerByConstructor = (LoggerByConstructor) context.getBean("loggerByConstructor");
	 loggerByConstructor.writeConsole("Dummy console log.");
	 loggerByConstructor.writeFile("Dummy file log.");
	 
	 context.close();
    }
}