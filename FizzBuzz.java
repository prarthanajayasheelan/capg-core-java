package com.capg.dollar;

public class FizzBuzz {
	
	public static void main(String[] args)
	{
		for(int i=1; i<100;i++)
			if(i%3==0 && i%5==0)
			{
				System.out.println("FIZZ BUZZ");
				
			}
			else if(i%3==0)
			{
				System.out.println("fizz");
			}
			else if(i%5==0)
			{
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
	}

}
