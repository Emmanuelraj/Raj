package com.guvi.codekata;

import java.util.Scanner;

/*
 * Write a program to calculate the sum of all the numbers less than a given number n
 */
public class Program26 
{
	public void calculate(int num)
	{
		int sum=0;
		while(num!=0)
		{
			num=num;
			sum=sum+num;
			num=num-1;
			
		}
		System.out.println(sum);
	}
	
	
 public static void main(String[] args)
 {
	 System.out.println("enter the calculate");
	 Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
  Program26 pr=new Program26();
  pr.calculate(n);
  System.out.println();

 }
}
