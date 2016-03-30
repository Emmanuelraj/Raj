package com.guvi.codekata;

import java.util.Scanner;

/*
 * Count the characters,numbers,alphanumerical in a given string - 9 submission

 */
public class Program24 
{
	public void calculate(String s)
	{
		int count=0;
		int count1=0;
		int count2=0;
		char[]c=s.toCharArray();
		String s1="";
		
		char[]c1=s.toCharArray();
		{
			for(int i=0;i<c1.length;i++)
			{
			if(Character.isLetter(c[i]))
			{
			count++	;
			}
			else
				if(Character.isDigit(c[i]))
			{
				count1++;
			}
			}
			count2=count+count1;
		}
		System.out.println("letter-->"+count);
		System.out.println("digit-->"+count1);
		System.out.println("letter and digit-->"+count2);
	}
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the sentence");
	
	String s=scan.nextLine();
	
	Program24 program24=new Program24();
	program24.calculate(s);
}
}
