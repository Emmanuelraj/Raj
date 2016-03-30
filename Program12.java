package com.guvi.codekata;

import java.util.Scanner;

/*
 * 12.Check whether a number is palindrome or not - 21 submission

 */
public class Program12 {
	public String isPalindrome(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			 sum=sum*10+rem;
			  num=num/10;
		}
		System.out.println("sum"+sum);
		if(num==sum)
		{
			return "palindrome";
		}
		else
		{
			return "not palindrome";	
		}
		
		
	}
 public static void main(String[] args) {
	 
	Scanner sc1=new Scanner(System.in);
	int n=sc1.nextInt();
	Program12 program12=new Program12();
	System.out.println(program12.isPalindrome(n));
	
			
}
}
