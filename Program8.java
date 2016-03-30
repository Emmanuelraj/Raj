package com.guvi.codekata;

import java.util.Scanner;

/*
 * 8.Calculate sum of natural numbers. - 32 submission
 * int add=0;
 * int count=0;
 * int[] arr=new int[al.size()]
 * iterate by for loop
 * if(num!=0)
 * {
 *  
 * }
 */
public class Program8 {
	public  void sumOfNatural(int n)
	{
		int sum=0;
	if(n==0)
	{
	System.out.println(n);
	}
	else
	
	for(int i=1;i<=n;i++)
	{
		sum+=i;
	}
	System.out.println(sum);
//	return sum;
	}
 public static void main(String[] args) {
	 
	 Program8 program8=new Program8();	
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number of values");
	int n=scanner.nextInt();
	program8.sumOfNatural(n);
}
 
 

}


