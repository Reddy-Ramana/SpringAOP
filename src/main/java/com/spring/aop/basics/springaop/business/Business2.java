package com.spring.aop.basics.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.aop.basics.springaop.data.Dao2;

@Service
public class Business2 {

	@Autowired
	private Dao2 dao2;

	public String CalculateSomething() {

		return dao2.retriveSomeValue();
	}

}
