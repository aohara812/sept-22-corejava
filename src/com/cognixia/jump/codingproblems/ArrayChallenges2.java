package com.cognixia.jump.codingproblems;

public class ArrayChallenges2 {

	public static void Missing(int arr[],  int A)
	{
		int i;
		int temp[] = new int[A + 1];
		for (i = 0; i <= A; i++) {
			temp[i] = 0;
		}
		
		for (i = 0; i < A; i++) {
			temp[arr[i] - 1] = 1;
		}
		
		int sum = 0;
		for (i = 0; i <= A; i++) {
			if (temp[i] == 0)
				sum = i + 1;
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,
				40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,
				59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,
				78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,
				98,99,100};
		int n = arr.length;
		
		Missing(arr,n);
				
		}

	}


