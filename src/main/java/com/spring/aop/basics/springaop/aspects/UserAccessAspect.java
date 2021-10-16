package com.spring.aop.basics.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class UserAccessAspect {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Before("execution(* com.spring.aop.basics.springaop.data.*.*(..))")
	public void checkUserAcess(JoinPoint joinpoint) {

		LOGGER.info("Checking for the user access");
		LOGGER.info("Access succesfull for {}", joinpoint);

	}

	@After("execution(* com.spring.aop.basics.springaop.business.*.*(..))")
	public void after(JoinPoint joinpoint) {

		LOGGER.info("This is in after aspect {}",joinpoint);
	}

	@AfterReturning(value = "execution(* com.spring.aop.basics.springaop.business.*.*(..))", returning="result")
	public void afterReturning(JoinPoint joinpoint,Object result) {

		LOGGER.info("This is in after Returning in {} with result {}",joinpoint,result);
	}
	
	
	@Around("execution(* com.spring.aop.basics.springaop.business.*.*(..))")
	public Object aroundAdvuse(ProceedingJoinPoint joinPoint) throws Throwable {

		long StartTime = System.currentTimeMillis();
		Object retValue = joinPoint.proceed();
		long totalTimeTaken = System.currentTimeMillis()-StartTime;
		LOGGER.info("TIme take to run {},is {}",StartTime,totalTimeTaken);
		return retValue;
	}
	
}
