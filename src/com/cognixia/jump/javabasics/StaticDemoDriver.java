package com.cognixia.jump.javabasics;

public class StaticDemoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 
		// Static Methods can be run from a class, no object needed
		StaticDemoClass.staticMethod();
		StaticDemoClass demo = new StaticDemoClass();
		StaticDemoClass.staticMethod();
		demo.instanceMethod();
		StaticDemoClass demo2 = new StaticDemoClass();
		demo2.instanceMethod();

	}

}
