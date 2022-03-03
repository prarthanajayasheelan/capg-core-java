package com.capg.dollar;

public class Pattern {
	
	public static void main(String[] args) 
	{
     	for(int i=0;i<7;i++)
		{
		//	for(int l=1;l<=2;l++)
		//	{
			for(int k=1;k<=2*i;k++)
			{
				System.out.print("*");
			}
		   for(int j=1;j<(2*(7-i+1)-1);j++)
            {
			   if(j<=7-i)
				{
	         System.out.print("$");
				}
				else
				{
                  System.out.print("*");
				}
          //   }
		}
             System.out.println();
             
             
		
		
		}
	}
}
