package com.cognixia.jump.classandobjects;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;
	
	// Would need to make a constructor for horse because it being a child class
	// for animal constructor
	public Horse(){
		super(); //Ability to pass data so would need to use super 
	}
	//Overloaded constructor
	public Horse(String type, double weight){
		super(type, weight);
	}
	
	// method overriding 
	// need inheritance, and the exact same method signature from the parent
	// the @Override is not required for overriding, but is helpful
	// is runtime polymorphism
	//@Override
	public void makeSound(String sound) {
		
		System.out.println("");
		System.out.println("This horse type" + super.getType() + "makes a" + sound + " ");
		
	}
	
	// method overloading 
	// Simply having a method with the same name, but changing the parameter set, and/or return type
	// Compile time polymorphism 
	public void makeSound(String sound, int volume) {
		System.out.println("Horse volume" + volume + "db making a " + sound + "sound.");
		
	}
	// also method overloading cant do it because its too similar to it. 
	public String makeSound() {
		return "Horse sound";
		
	}
}

