package com.cognixia.jump.codingproblems;

import java.util.Arrays;

public class ArrayChallenges {

	public static void main(String[] args) {
	// Initialized the three object arrays to compare
	int[] a = new int[] {1, 2, 3, 4};
	int[] b = new int[] {4, 3, 2, 1};
	int[] c = new int[] {1, 2, 5, 4};
	// Sorting the arrays
	Arrays.sort(a);
	Arrays.sort(b);
	Arrays.sort(c);
	
	// Evaluate if true or false 
	boolean returnVal1 = Arrays.equals(a,b);
	System.out.println("Are a and b equal?: " + returnVal1);
	
	boolean returnVal2 = Arrays.equals(a,c);
	System.out.println("Are a and c equal?: " + returnVal2);
		

	}
	
}
