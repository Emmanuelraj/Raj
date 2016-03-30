package com.guvi.codekata.player;

import java.util.Scanner;

/*
 * 7.Swap the even and odd characters in a given string. - 14 submission
 
 */
public class Program7
{
public  void swapOddAndEven(String str)
{
	System.out.println("--->"+str);
	char[]c =str.toCharArray();
	//System.out.println("c--->"+c);
	for(int i=0;i<c.length-1;i++)
	{
		char c1=c[i];
		c[i]=c[i+1];
		c[i+1]=c1;
		i+=1;
	}
	String s="";
	for(int i=0;i<c.length;i++)
	{
		s+=c[i];
	}
	System.out.println(s);
	
}
	
	public static void main(String[] args)
	{
		System.out.println("enter the String "); 
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		Program7 program7=new Program7();
		program7.swapOddAndEven(s);
		System.out.println();
	}
	 

}
