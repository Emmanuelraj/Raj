package com.guvi.codekata.player;

import java.util.Scanner;

/*
 * Factorial of a given number.
 * testcases 
 * 5=5*4*3*2*1=125
 */
public class Program2 
{
	public int isfact(int num)
	{   
		if(num==1)
		{
			return 1;
		}
		return num*isfact(num-1);
	}
 
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Program2 pr=new Program2();
		System.out.println(pr.isfact(n));
		
	
    }
}
