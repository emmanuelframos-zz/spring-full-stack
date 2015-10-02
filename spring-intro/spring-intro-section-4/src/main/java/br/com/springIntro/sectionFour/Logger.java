package br.com.springIntro.sectionFour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {
    
    @Autowired
    private ConsoleWriter consoleWriter;
    
    @Autowired
    private FileWriter fileWriter;
    
    @Autowired
    /** Autowiring by name **/
    @Qualifier("anotherConsoleWriter")
    private ConsoleWriter anotherConsoleWriter;
       
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }
        
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }
    
    public void writeConsole(String text){
	consoleWriter.write(text);
    }
    
    public void writeFile(String text){
	fileWriter.write(text);
    }    
}