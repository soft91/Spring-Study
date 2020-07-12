package com.yoon.annotation;

import org.springframework.stereotype.Component;

@Component("hyundaiEngine")
public class HyundaiEngine implements Engine {
	
	public void EngineStart() {
		System.out.println("Hyundai Engine Start");
	}
	
	public void EngineStop() {
		System.out.println("Hyundai Engine Stop");
	}
}
