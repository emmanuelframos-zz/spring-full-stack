package br.com.springIntro.sectionThree;

public class ConsoleWriter implements LogWriter{
    
    public void write(String text){
	System.out.println(text);
    }

}