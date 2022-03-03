package com.capg.examples;

public class Test {
	
	public static void main(String[] args)
	{
		System.out.println(Employee.company);
		//System.out.println(Employee.id);
		//System.out.println(Employee.name);
		
		Employee e1=new Employee(1,"nags");
		Employee e2=new Employee(2,"sree");
		System.out.println(e1.id);
	    System.out.println(e1.name);
	    System.out.println("_________________");
	    System.out.println(e2.id);
	    System.out.println(e2.name);
	  				
	}

}
