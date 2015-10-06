package br.com.springIntro.sectionNine;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	Camera camera = (Camera) context.getBean(Camera.class);
	
	camera.snap();
	
	context.close();
    }
}
