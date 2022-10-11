package com.cognixia.jump.classandobjects;

public class Engine {
	// Encapsulating these variables together to explain them.
	private double size;
	private String alignment;
	private int numCylinders;
	private String manufacturor;
	
	
	// Constructor
	public Engine() {
		this.size = 3.0;
		this.alignment = "inline";
		this.numCylinders = 4;
		this.manufacturor = "Toyata";
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}


	public String getAlignment() {
		return alignment;
	}


	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}


	public int getNumCylinders() {
		return numCylinders;
	}


	public void setNumCylinders(int numCylinders) {
		this.numCylinders = numCylinders;
	}


	public String getManufacturor() {
		return manufacturor;
	}


	public void setManufacturor(String manufacturor) {
		this.manufacturor = manufacturor;
	}


	@Override
	public String toString() {
		return "Engine [size=" + size + ", alignment=" + alignment + ", numCylinders=" + numCylinders
				+ ", manufacturor=" + manufacturor + "]";
	}
	

}
