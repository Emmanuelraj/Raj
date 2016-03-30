package com.guvi.codekata;

import java.util.Scanner;

public class Program13 {
	public String isPrime(int num)
	{
		if(num%2==0)
		{
			return "nt prime";
		}
		for(int i=3;i<(int)Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				return " not prime";	
			}
			
		}
		return "prime";
	}
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		
		
		Program13 pr=new Program13();
		
		System.out.println(pr.isPrime(n));
	}
	

}
