package br.com.springIntro;

public class PersonFactory {

    public Person getInstance(String name){
	System.out.println("Using factory to create person.");
	return new Person(name);
    }
}
