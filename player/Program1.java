package com.guvi.codekata.player;

import java.util.Scanner;

/*
 * 1.Reverse a string.
 *  test case
 *  
 */
public class Program1 
{
	public String reverseString(String s)
	{
		String str="";
		char[]c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			str=str+c[i];
		}
		return str;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("enter the string");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
	 Program1 program1=new Program1();
	 String s1=program1.reverseString(s);
	 System.out.println(s1);
		
	}

}
