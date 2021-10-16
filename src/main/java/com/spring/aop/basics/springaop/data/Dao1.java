package com.spring.aop.basics.springaop.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
 
	private Logger LOGGER  = LoggerFactory.getLogger(this.getClass());
	
	public String retriveSomeValue() {

		LOGGER.info("within Dao1");
		return "Dao1";
	}
}
