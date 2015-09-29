package com.caveofprogramming.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Pointcut("args(int, double)")
	public void somePointcut(){}
	
	@Before("somePointcut()")
	public void somePointcutDemo(JoinPoint jp) {
		System.out.println("********* BEFORE DEMO **********");
		
		for(Object obj: jp.getArgs()){
			System.out.println("ARG: " + obj);
		}
	}
	
}
