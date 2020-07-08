package com.yoon.injection;

public class Hyundai {
	private Engine engine;
	
	public Hyundai() {
		System.out.println("This is Hyundai");
	}
	
	public Hyundai(Engine engine) {
		System.out.println("This is Hyundai 2");
		this.engine = engine;
	}
	
	public void EngineStart() {
		engine.EngineStart();
	}
	
	public void EngineStop() {
		engine.EngineStop();
	}
}
