package com.spring.aop.basics.springaop.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.spring.aop.basics.springaop.aspects.TrackTime;

@Repository
public class Dao1 {
 
	private Logger LOGGER  = LoggerFactory.getLogger(this.getClass());
	
	@TrackTime
	public String retriveSomeValue() {

		LOGGER.info("within Dao1");
		return "Dao1";
	}
}
