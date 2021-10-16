package com.spring.aop.basics.springaop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCuts {

	
	@Pointcut("execution(* com.spring.aop.basics.springaop.data.*.*(..))")
	public void dataLayerPointCut() {}
	
	@Pointcut("execution(* com.spring.aop.basics.springaop.business.*.*(..))")
	public void businessLayerPointCut() {}
	
	@Pointcut("@annotation(com.spring.aop.basics.springaop.aspects.TrackTime)")
	public void annotationPointCut() {}
}
