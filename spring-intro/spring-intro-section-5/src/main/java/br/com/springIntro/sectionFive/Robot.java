package br.com.springIntro.sectionFive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
    private String speech;
    
    public void speak(){
	System.out.println(speech);
    }

    /** Marks a constructor, field, setter method or config method as to be autowired by Spring's dependency injection facilities. **/
    @Autowired     
    public void setSpeech(@Value("#{randomText.getText()}") String speech) {
        this.speech = speech;
    }    
}