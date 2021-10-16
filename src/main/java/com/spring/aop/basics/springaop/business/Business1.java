package com.spring.aop.basics.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.aop.basics.springaop.data.Dao1;

@Service
public class Business1 {

	@Autowired
	private Dao1 dao1;

	public String CalculateSomething() {

		return dao1.retriveSomeValue();
	}

}
