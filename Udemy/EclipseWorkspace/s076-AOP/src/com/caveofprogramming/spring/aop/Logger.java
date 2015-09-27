package com.caveofprogramming.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Pointcut("within(com.caveofprogramming.spring..*)")
	public void withinDemo(){}
	
	@Pointcut("target(com.caveofprogramming.spring.aop.Camera)")
	public void targetDemo(){}
	
	@Pointcut("this(com.caveofprogramming.spring.aop.Camera)")
	public void thisDemoUsingTargetClass(){}
	
	@Pointcut("this(com.caveofprogramming.spring.aop.ICamera)")
	public void thisDemoUsingTargetInterface(){}
	
	@Pointcut("this(com.caveofprogramming.spring.aop.ICamera)")
	public void thisDemo(){}
	
	@Before("withinDemo()")
	public void withinDemoAdvice(){
		System.out.println("**********WITHIN DEMO(Before advice)***********");
	}
	
	@Before("targetDemo()")
	public void targetDemoAdvice(){
		System.out.println("**********TARGET DEMO(Before advice)***********");
	}
	
	@Before("thisDemoUsingTargetClass()")
	public void thisDemoUsingTargetClassAdvice(){
		System.out.println("**********THIS DEMO TARGET CLASS(Before advice)***********");
	}
	
	@Before("thisDemoUsingTargetInterface()")
	public void thisDemoUsingTargetInterfaceAdvice(){
		System.out.println("**********THIS DEMO TARGET INTERFACE(Before advice)***********");
	}
	
}
