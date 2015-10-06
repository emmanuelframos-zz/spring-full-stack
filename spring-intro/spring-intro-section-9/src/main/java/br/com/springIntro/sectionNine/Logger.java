package br.com.springIntro.sectionNine;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    
    @Around("execution(* br.com.springIntro.sectionNine.Camera.snap())")
    public void aroundToTakeAPhoto(ProceedingJoinPoint joinPoint) throws Throwable{
       System.out.println("Around to take a photo...");
       joinPoint.proceed();
   }
    
    @Before("execution(* br.com.springIntro.sectionNine.Camera.snap())")
    public void aboutToTakeAPhoto(){
	System.out.println("About to take a photo...");	
    }   
    
    @After("execution(* br.com.springIntro.sectionNine.Camera.snap())")
    public void photoTaken(){
	System.out.println("The photo was taken...");	
    }
}