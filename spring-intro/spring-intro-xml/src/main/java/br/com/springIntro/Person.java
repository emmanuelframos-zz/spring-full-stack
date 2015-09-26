package br.com.springIntro;

public class Person {
    private String name;
    private String nickName;
    private Address address;
     
    public Person() {
    }
    
    public Person(String name) {
	this.name = name;
    }    
    
    public void onCreate(){
	System.out.println(name + " created.");
    }   
    
    public void onDestroy(){
  	System.out.println(name + " destroyed.");  
    }    

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getNickName() {
	return nickName;
    }

    public void setNickName(String nickName) {
	this.nickName = nickName;
    }    

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void speak() {
	System.out.println("Hello I'm " + name + "!");
    }
}