package com.cognixia.jump.codingproblems;

public class MathChallenge {
	
	public static void main(String str[])
	{
		// Assigning the values to x and y 
		int x = 13; 
		int y = 22;
		
		// Setting up values of it. 
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("Swapping:" + "x = " + x + ", y = " + y);
	}

}
