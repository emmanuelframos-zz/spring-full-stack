package br.com.springIntro.sectionTwo;

import java.util.List;
import java.util.Map;

public class Jungle {
    private List<Animal> animals;
    private Map<String, String> foods;
    private Map<Animal, Animal> rivalAnimal;

    public List<Animal> getAnimals() {
	return animals;
    }

    public void setAnimals(List<Animal> animals) {
	this.animals = animals;
    }

    public Map<String, String> getFoods() {
	return foods;
    }

    public void setFoods(Map<String, String> foods) {
	this.foods = foods;
    }

    public Map<Animal, Animal> getRivalAnimal() {
        return rivalAnimal;
    }

    public void setRivalAnimal(Map<Animal, Animal> rivalAnimal) {
        this.rivalAnimal = rivalAnimal;
    }   
}