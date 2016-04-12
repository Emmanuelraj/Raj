package com.guvi.codekata.player;

import java.util.Scanner;

/*
 * implement strlenn()
 * 
 */
public class Pro52 
{
	
	public int strLen(String s)
	{
	
		int coun=0;
	 char[]c=s.toCharArray();
	 for(char c1:c)
	 {
		 coun++;
	 }
	 return coun;
	}
	public static void main(String[] args) 
	{
		System.out.println("enter the string");
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		Pro52 p=new Pro52();
		
		System.out.println(p.strLen(str));
	}

}
