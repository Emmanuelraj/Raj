package com.guvi.codekata.player;

import java.util.Scanner;

public class Program9 
{
	public String isPrime(int num)
	{
		if(num%2==0)
		{
			return " not prime";
		}
		System.out.println((int)Math.sqrt(num));
		for(int i=2;i<(int)Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				return "not prime";
			}
		}
		return "prime";
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("enter the values");
		Scanner scan=new Scanner (System.in);
		int s=scan.nextInt();
		Program9 pr=new Program9();
		String s1=pr.isPrime(s);
		System.out.println(s1);
	}

}
