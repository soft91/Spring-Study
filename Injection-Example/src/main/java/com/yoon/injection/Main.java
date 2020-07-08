package com.yoon.injection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		Kia kia = (Kia) factory.getBean("kia");
		
		kia.EngineStart();
		kia.EngineStop();
		
		factory.close();
	}
}
