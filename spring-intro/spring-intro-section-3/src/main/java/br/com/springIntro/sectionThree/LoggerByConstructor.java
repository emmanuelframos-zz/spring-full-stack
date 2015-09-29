package br.com.springIntro.sectionThree;

public class LoggerByConstructor {
    private ConsoleWriter consoleWriter;
    private FileWriter fileWriter;
    
    public LoggerByConstructor(ConsoleWriter consoleWriter, FileWriter fileWriter){
	this.consoleWriter = consoleWriter;
	this.fileWriter = fileWriter;
    }    
    
    public void writeConsole(String text){
	consoleWriter.write(text);
    }
    
    public void writeFile(String text){
	fileWriter.write(text);
    }    
}
