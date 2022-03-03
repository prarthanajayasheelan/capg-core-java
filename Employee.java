package com.capg.operations;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {
	
	long mobileNo;
	String employeeName;
	Date empDoj;
	int employeeId;
	Date empDob;
	
	Scanner sc  = new Scanner(System.in);
	//methods to access above variables
	void reademployeeDetails() throws ParseException {
		System.out.println("Enter the employee data");
		System.out.println("enter employee mobile no.");
		mobileNo=sc.nextLong();
		
		System.out.println("Enter the employee id");
		employeeId = sc.nextInt();
		System.out.println("Enter the employee name");
		sc.nextLine();//throw away the newline read by scanner
		employeeName = sc.nextLine();
		System.out.println("Enter the employee doj in 'dd/MM/yyyy' ");
		String doj = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		empDoj= sdf.parse(doj);
		System.out.println("Enter the employee dob in 'dd/MM/yyyy' ");
		String dob = sc.nextLine();
		SimpleDateFormat dobe= new SimpleDateFormat("dd/MM/yyyy");
		empDob= dobe.parse(dob);
	}
	
	@SuppressWarnings("deprecation")
	void displayemployeeDetails(){
		System.out.println("Entered the employee data ...............");
		System.out.println("mobileNo=" + mobileNo);
		System.out.println("employee id = " + employeeId );
		System.out.println("employee name = " + employeeName);
		System.out.println("employee doj = " + empDoj.getDate()+"/"+empDoj.getMonth()+"/"+empDoj.getYear());
		System.out.println("employee dob = " + empDob.getDate()+"/"+empDob.getMonth()+"/"+empDob.getYear());
	}


}
