package br.com.springIntro.sectionFive;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomText {
    private String[] texts = {"Luke, I'm your father!", "Bazinga!", "Shazam!"};
    
    public String getText(){
	Random random = new Random();	
	return texts[random.nextInt(texts.length)];
    }
}