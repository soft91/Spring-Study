package com.yoon.annotation;

import org.springframework.stereotype.Component;

@Component("kiaEngine")
public class KiaEngine implements Engine {
	public void EngineStart() {
		System.out.println("Kia Engine Start");
	}
	
	public void EngineStop() {
		System.out.println("Kia Engine Stop");
	}
}
