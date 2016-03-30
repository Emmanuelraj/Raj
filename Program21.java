package com.guvi.codekata;

import java.util.Scanner;

/*
 * 
 * 
 */
public class Program21 
{
	public void fibonacci(int num)
	{
		//System.out.println(num);
		int[] fib=new int[num];
		fib[0]=0;
		System.out.println(fib[0]);
		
		fib[1]=1;
		System.out.println(fib[1]);
		
		for(int i=2;i<num;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
			System.out.println(fib[i]);
				
		}
			}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Program21 pro=new Program21();
		pro.fibonacci(5);
		
		
		
	}

}
