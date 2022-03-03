package com.capg.examples;

public class Test1 {
	
	public void display()
	{
		System.out.println("invoke display method ");
	}
	{
		System.out.println("invoke normal method"); 
	}
	
	public static void focus() {
		System.out.println("invoke focus method");
	}
	
	public static void main(String[] args) {
		
		Test1.focus();
		
		Test1 t1=new Test1();
		t1.display();
	}

}
