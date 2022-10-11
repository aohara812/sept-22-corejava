package com.cognixia.jump.exceptionhandling;

import java.util.Scanner;
import java.util.

// This class serves to run try/catch examples. finally try w/resources, propogation
// Throws, throw, and custom exceptions
public class ExceptionDriver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int inNum = 0;
		// try catch
		try {
			
			
		
			System.out.println("Input an integer:");
			inNum = input.nextInt();
			
				
			}
			catch (Exception e) { // an empty catch block is bad.
				
		}
		System.out.println(inNum);

	}

}
