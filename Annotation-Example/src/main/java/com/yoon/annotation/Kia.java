package com.yoon.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Kia {
	@Autowired
	@Qualifier("kiaEngine")
	private Engine engine;
	
	public Kia() {
		System.out.println("This is Kia");
	}
	
	public void EngineStart() {
		engine.EngineStart();
	}
	
	public void EngineStop() {
		engine.EngineStop();
	}
}
