package com.guvi.codekata.player;

import java.util.Scanner;

/*
 * 3.Reverse the digits of an integer.
 * 123=321
 */
public class Program3 
{
 public int reverseInt(int num)
 {
	 int sum=0;
	 while(num!=0)
	 {
		int  n1=num%10;
		 sum=sum*10+n1;
		 num=num/10;
	 }
	 return sum;
 }
  public static void main(String[] args) 
  {
	  System.out.println("enter the number");
	Scanner scan1=new Scanner(System.in);
	int n=scan1.nextInt();
	Program3 pr=new Program3();
	System.out.println(pr.reverseInt(n));
	
  }
}
