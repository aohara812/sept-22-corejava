package com.cognixia.jump.javabasics;

import com.cognixia.jump.classandobjects.Animal;
import com.cognixia.jump.classandobjects.Horse;
import com.cognixia.jump.classandobjects.Unicorn;

// This class will demo declaring, insatiating, reading, writing, and looping
//through arrays both primitive values and objects. 
public class ArrayDemoDriver {

	public static void main(String[] args) {
		
		// Declare an array
		int[] temperatures;
		int grades[] = {90, 85, 87, 90};
		
		// instatiate 
		temperatures = new int[5];
		Animal[] animals = {
				new Animal(),
				new Animal("horse", 500.0),
				new Animal("cat", 20.0),
				new Animal("dog", 20.0)};
				
				
		Animal[] altAnimals = new Animal[3];
		
		// read from array 
		System.out.println(animals[0]);
		System.out.println(altAnimals[0]);
		
		
		// Warning! out of bounds 
		System.out.println(grades[0]);
		
		// write to array 
		grades[0] = 100;
		System.out.println(grades[0]);
		
		System.out.println(animals[1]);
		
		animals[1] = null;
		System.out.println(animals[1]);
		
		//Iterating through an array, not optimal using a while loop
		System.out.println("\nLooping through grades array:");
		int counter = 0; 
		while(counter < grades.length) {
			System.out.println(grades[counter]);
			counter++;
			
			// Preferred to use for loops 
		
	}
		for(int index = 0; index < grades.length; index++) {
			System.out.println(grades[index]);
		}
		for(int i = grades.length; i > 0; i--) {
			System.out.println(grades[i]);
		}
		
		// For each loop, left side is a variable that reps a single item in the array
		// which is the right of the colon. 
		for(int grade : grades) {
			System.out.println(grade);
		}
		System.out.println("\nfor each loop");
		for (Animal animal : animals) {
			if(animal != null && animal.getType().equals("dog")) {
		//		animal.setType("Bear");
				animal = null;
			}
			System.out.print(animal);
		}
		System.out.println("\nverify for each loop writing.");
		for (Animal animal: animals) {
			
			System.out.println(animal);
		}
		// Heterogenous Arrays 
		Animal[] creatures = new Animal[4];
		
		creatures[1] = new Animal();
		creatures[2] = new Horse("Clydesdale", 500.0);
		creatures[3] = new Unicorn();
		creatures[4] = new Animal("Dog", 40.0);
		
		for (Animal animal : creatures) {
			System.out.println(animal);
		}
		
		char[][] grid = {
					{'a', 'b', 'c'},
						{'d','e','f'},
						{'g','h','i'}
		};
		
		for(int col = 0; col < grid[0].length; col++) {
			for(int row = 0; row < grid.length; row++) {
				System.out.println(grid[row][col]);
			}
				
		}
	}
}

