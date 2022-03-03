package com.capg.dollar;

public class Student {
	
	String year;
	int noOfCourses;
	double cgpa;
	
	public Student(String year,int noOfCourses,double gpa)
	{
		this.year=year;
		this.noOfCourses=noOfCourses;
		this.cgpa=cgpa;
	}	
		@Override
	public String toString() {
		
		return "Student[year="+year+"noOfCourses"+noOfCourses+"cgpa="+cgpa+"]";
	}

public static void main(String[] args)
{
	Student s=new Student("fresher",5,8.5);
	Student s1=new Student("sophomore",7,8.5);
	Student s2=new Student("junior",5,8.9);
	Student s3=new Student("senior",9,8.5);
	System.out.println(s+"\n"+s1+"\n"+s2+"\n"+s3);
}









}
