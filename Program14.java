package com.guvi.codekata;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 14.Display odd numbers between two intervals - 15 submission

 */
public class Program14 {
	
	public void isOdd(int m,int n)
	{
		
		for(int i=m;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(""+i);
			}
		}
		
	
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		Program14 pro=new Program14();
		
		pro.isOdd(m,n);
		
	}


}
