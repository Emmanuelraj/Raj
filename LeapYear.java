package com.guvi.codekata;

import java.util.Scanner;

public class LeapYear {
	public  static String isLeapYear(int n)
	{
		boolean flag=false;
		if(n%400==0||n%4==0)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		if(flag==true)
		{
			return "LeapYear";
		}
		return "non Leap";
	}
	public static void main(String[] args) {
		System.out.println("enter the year");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
	String  s=LeapYear.isLeapYear(2001);
		System.out.println(s);
		
	}
}
