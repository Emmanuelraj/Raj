package com.guvi.codekata;

import java.util.Scanner;

public class Program2 {
	public String isOddOrEven(int num)
	{
		if(num%2==0)
		{
			return "even";
		}
		return "odd";
	}
	public static void main(String[] args) {
 Scanner sc1=new Scanner(System.in);
 System.out.println("enter the no");
 
 int n=sc1.nextInt();
 
 Program2 pro=new Program2();
 System.out.println(pro.isOddOrEven(n));
 
}

}
