package com.guvi.codekata;
/*
 * 25.Reverse a number - 12 submission

 */
public class Program22
{
	public int reverseNumber(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
					
		}
		
		return sum;
	}

	
	
	
	public static void main(String[] args) 
	{
		Program22 p1=new Program22();
		System.out.println(p1.reverseNumber(123));
		
	}
	

}
