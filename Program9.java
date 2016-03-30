package com.guvi.codekata;

import java.util.Scanner;

public class Program9{
	/*
	 * 10.Count number of digits of an integer. - 22 submission
	 */
	
	public void isCountNumberOfDigits(int m)
	{
	String s=""+m;
	int count=0;
	char[]c=s.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		if(Character.isDigit(c[i]))
		{
			count++;
		}
	}
System.out.println(count);
	}
	public static void main(String[] args) {
		Program9 program9=new Program9();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		program9.isCountNumberOfDigits(n);
		
		
	}
	

}
