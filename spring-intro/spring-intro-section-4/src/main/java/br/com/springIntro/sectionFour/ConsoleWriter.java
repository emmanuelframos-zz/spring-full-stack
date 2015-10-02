package br.com.springIntro.sectionFour;

public class ConsoleWriter implements LogWriter{
    
    public void write(String text){
	System.out.println(text);
    }

}