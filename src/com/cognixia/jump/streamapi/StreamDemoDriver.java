package com.cognixia.jump.streamapi;

public class StreamDemoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] primitive = {2,4,6,8,10,12,14,16};
		
		// Convert the above array of ints to an array of objects 
		
		Integer[] integers = new Integer[primitive.length];
		for(int i = 0; i < primitive.length; i++) {
			integers[i] = primitive[i];
		}

	}

}
