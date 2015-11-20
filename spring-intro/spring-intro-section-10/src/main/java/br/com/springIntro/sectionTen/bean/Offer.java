package br.com.springIntro.sectionTen.bean;

public class Offer {
    private Integer id;
    private String name;
    private String email;
    private String text;
    
    private Offer(){}
    
    public static Offer build(){
	return new Offer();
    }

    public Integer getId() {
	return id;
    }

    public Offer id(Integer id) {
	this.id = id;
	return this;
    }

    public String getName() {
	return name;
    }

    public Offer name(String name) {
	this.name = name;
	return this;
    }

    public String getEmail() {
	return email;
    }

    public Offer email(String email) {
	this.email = email;
	return this;
    }

    public String getText() {
	return text;
    }

    public Offer text(String text) {
	this.text = text;
	return this;
    }

    @Override
    public String toString() {
	return "Offer [id=" + id + ", name=" + name + ", email=" + email + ", text=" + text + "]";
    }    
}