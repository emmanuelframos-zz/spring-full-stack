package br.com.springIntro.sectionTwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    @SuppressWarnings("unused")
    public static void main( String[] args )     {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	Person mike = (Person) context.getBean("person");
	mike.speak();
	
	Person mary = (Person) context.getBean("personFactoryCreated");
	mary.speak();	
		
	FruitBasket basket = (FruitBasket)  context.getBean("basket");
	
	Jungle jungle = (Jungle) context.getBean("jungle");
	
	Jungle anotherJungle = (Jungle) context.getBean("anotherjungle");
	
	Jungle jungleFoods = (Jungle) context.getBean("junglefoods");
	
	Jungle rivalsOnJungle = (Jungle) context.getBean("rivalsonjungle");
	
	context.close();
    }    
}