package com.cognixia.jump.classandobjects;

// This class intended to uncover some unusal behaviors of the String class
// and String objects, compared to primitives and other Class Objects.
// Because some general rules of Class/Objects are seemingly broken by Strings in JAVA.
public class StringDemoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "str1";
		String str2 = "str2";
		String str3 = str1;
		String str4 = new String("str1");
		String str5 = new String("str5");
		
		System.out.println("Variable str1 == str2 " + (str1 == str2));
		System.out.println("Variable str1 == str3 " + (str1 == str3));
		System.out.println("Variable str2 == str3 " + (str2 == str3));
		System.out.println("Variable str1 == str4 " + (str1 == str4) + "str1=" + str1 + ",str4=" + str4);
		System.out.println("Variable str4 == str5 " + (str4 == str5));

	

	}

}
