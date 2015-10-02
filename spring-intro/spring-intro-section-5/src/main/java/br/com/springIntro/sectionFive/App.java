package br.com.springIntro.sectionFive;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	
	Robot robot = (Robot)applicationContext.getBean("robot");	
	robot.speak();
	
	applicationContext.close();
    }
}