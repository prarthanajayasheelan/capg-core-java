package com.capg.operations;

public class SumOf {
	
	
	    public static void main(String args[])
	    {
	        int arrays[] = { 1, 2, 3, 4, 5, 6,8,9,5,7 };
	        int even = 0, odd = 0;
	 
	        // Loop to find even, odd sum
	        for (int i = 0; i < arrays.length; i++) {
	            if (i % 2 == 0)
	                even += arrays[i];
	            else
	                odd += arrays[i];
	        }
	 
	        System.out.println("Even index positions sum: " + even);
	        System.out.println("Odd index positions sum: " + odd);
	    }
	}


