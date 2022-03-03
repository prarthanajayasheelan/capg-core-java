package com.capg.operations;
import java.util.*;
public class Remove {
	
	 public static int[] removeTheElement(int[] arr, int index)
	    {
	 
	       
	        if (arr == null || index < 0
	            || index >= arr.length) {
	 
	            return arr;
	        }
	 
	        // Create another array of size one less
	        int[] anotherArray = new int[arr.length - 1];
	 
	       
	        for (int i = 0, k = 0; i < arr.length; i++) {
	            if (i == index) {
	                continue;
	            }
	 
	         
	            anotherArray[k++] = arr[i];
	        }
	 
	        return anotherArray;
	    }
	 
	   
	    public static void main(String[] args)
	    {
	 
	        // Get the array
	        int[] arr = { 1, 2, 3, 4, 5 };
	 
	        // Print the resultant array
	        System.out.println("Original Array: "
	                           + Arrays.toString(arr));
	 
	        // Get the specific index
	        int index = 2;
	 
	        // Print the index
	        System.out.println("Index to be removed: " + index);
	 
	        // Remove the element
	        arr = removeTheElement(arr, index);
	 
	        // Print the resultant array
	        System.out.println("Resultant Array: "
	                           + Arrays.toString(arr));
	    }
	}

