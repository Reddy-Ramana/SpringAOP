package com.spring.aop.basics.springaop.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.aop.basics.springaop.data.Dao1;

@Service
public class Business1 {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private Dao1 dao1;

	public String CalculateSomething() {

		LOGGER.info("Inside Business1");
		return dao1.retriveSomeValue();
	}

}
