package com.capg.operations;

import java.text.ParseException;

public class EmployeeMain {

		
public static void main(String[] args) throws ParseException {
			
			//following statement creates an object
			Employee emp = new Employee();
			emp.reademployeeDetails();
			emp.displayemployeeDetails();
			
			Employee emp1 = new Employee();
			emp1.reademployeeDetails();
			emp1.displayemployeeDetails();
		}

	}


