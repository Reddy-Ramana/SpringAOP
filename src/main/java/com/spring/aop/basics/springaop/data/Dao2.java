package com.spring.aop.basics.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

	public String retriveSomeValue() {

		return "Dao2";
	}
}
