package com.yoon.injection;

public class Kia {
	private Engine engine;
	
	public Kia() {
		System.out.println("This is Kia");
	}
	
	public void setEngine(Engine engine) {
		System.out.println("This is Kia 2");
		this.engine = engine;
	}
	
	public void EngineStart() {
		engine.EngineStart();
	}
	
	public void EngineStop() {
		engine.EngineStop();
	}
}
