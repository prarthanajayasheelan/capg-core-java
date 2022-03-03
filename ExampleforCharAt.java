package com.capg.string;

public class ExampleforCharAt {

	public static void main(String[] args) {
	

		String s="HELLO WORLD";
		
		System.out.println(s.charAt(2));
		System.out.println(s.toLowerCase());
		
		String s1="welcome";
		System.out.println(s1.toUpperCase());
		
		System.out.println("##############################");
		
		String s2="throne";
		
		String s3=new String("hai");
		String s4=new String("hello");
		String s5=new String("hai");
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals(s5));
		System.out.println(s3.equals(s1));
		
		System.out.println((s2==s1));
		System.out.println((s3==s5));
		
		System.out.println("########################");
		
		int i=100;
		
		String x=String.valueOf(i);
		String x1="var";
		
		System.out.println(x.concat(x1));
		
	}

}
