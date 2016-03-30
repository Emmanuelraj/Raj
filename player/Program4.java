package com.guvi.codekata.player;

import java.util.Scanner;

/*
 * 4.String to integer conversion. 
 * test cases
 * 123=123
 * 
 */
public class Program4 
{
	
	public int strToInt(String s)
	{
		String s1="";
		int a=Integer.parseInt(s);
		return a;
		
	}
 public static void main(String[] args) 
 {
	System.out.println("enter the integer"); 
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	String s=""+n;
	Program4 p=new Program4();
	
	System.out.println(p.strToInt(s));
 }
}
