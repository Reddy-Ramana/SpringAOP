package com.spring.aop.basics.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

	public String retriveSomeValue() {

		return "Dao1";
	}
}
