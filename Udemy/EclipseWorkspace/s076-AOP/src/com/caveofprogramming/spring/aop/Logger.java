package com.caveofprogramming.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Pointcut("args(exposure, ..)")
	public void somePointcut(int exposure){}
	
	@Before("somePointcut(exposure)")
	public void somePointcutDemo(JoinPoint jp, int exposure) {
		System.out.println("********* BEFORE DEMO **********");
		
		System.out.printf("exposure %d\n", exposure);
	}
	
}
