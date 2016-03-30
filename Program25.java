package com.guvi.codekata;

import java.util.Scanner;

/*
 * 28.Write a program that will exit When I press Q in keyboard - 8 submission

 */
public class Program25
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	char c=scan.next().charAt(0);
	if(c=='Q')
	{
		System.out.println("everything okay");
		System.exit(0);
		

			
		}
	//System.out.println("error");
	
	System.exit(1);
	
	
	
}
}
