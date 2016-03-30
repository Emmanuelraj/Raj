package com.guvi.codekata;

import java.util.Scanner;

public class Factorial {

	public long isFact(int num)
	{
		if(num==1)
		{
			return 1;
			
		}
		else
		{
			return num*isFact(num-1);
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println("enter the values ");
		Scanner sc1=new Scanner(System.in);
		int l=sc1.nextInt();
		Factorial fact =new Factorial();
		
		System.out.println(fact.isFact(l));
	}
	
}
