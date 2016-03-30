package com.guvi.codekata;

import java.util.Scanner;

public class Program1 {
	public String isPosNegOrZero(int num)
	{
		if(num>0)
		{
			return "positive";
		}
		else 
			if(num==0)
			{
				
				return "zero";
			}
		return "negaitive";
	}

	public static void main(String[] args) {
   Scanner scan1=new Scanner(System.in);
   System.out.println("enter the no");
   int n=scan1.nextInt();
   Program1 pro=new Program1();
   
   System.out.println(pro.isPosNegOrZero(n));

	}

}
