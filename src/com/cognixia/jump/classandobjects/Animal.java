package com.cognixia.jump.classandobjects;

import java.io.Serializable;

public class Animal implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;
	
	// A basic class is known in java as a POJO
	// Plain Old Java Object, or also a 
	
	//Attributes
	// The absence of a modifier, makes a field/method/constructor DEFAULT access
	 private String type; 
	 private double weight;
	 public static int count = 0;
	
	//Constructors
	public Animal(){
		this.type = "N/A";
		this.weight = 0.0;
		count++;
	}
	
	public Animal(String type, double weight){
		this.type = type;
		this.weight = weight;
	}
	
	//Methods 
	// Method syntax is (method signature):
	// access modifier, return type, name of the method, parameter set()
	 public void makeSound(String sound){
		 
		System.out.println("Animal makes " + sound);
		
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", weight=" + weight + "]";
	}
	// Add getters and setters 

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	 
}
