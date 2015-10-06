package br.com.springIntro.sectionNine;

import org.springframework.stereotype.Component;

@Component
public class Camera {

    public void snap(){
	System.out.println("Snap!");
    }
}
