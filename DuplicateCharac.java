package com.capg.operations;

public class DuplicateCharac {


	  public static void main(String[] args) {      
        
	        //Initialize array   
	        char [] arr = new char [] {'p','u','r','e','s','e','a'};   
	          
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }  
	    }  

 }  

