package com.cognixia.jump.codingproblems;

import java.util.Scanner;

// String which needs to be read the same both forward and backwards.
public class Palindrome_Challenge {
	
 public static void main(String args[])
 {
	 String str, check = "";
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Enter String: ");
	 str = scan.nextLine();
	 
	 int length = str.length();
	 // For loop 
	 for (int i = length -1; i >= 0; i--)
		 check = check + str.charAt(i);
	 
	 if(str.equals(check))
		 System.out.println(str+" is a palindrome");
	 else 
		 System.out.println(str+" Not a Palindrome");
	 
 }
}
