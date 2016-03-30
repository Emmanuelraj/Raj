package com.guvi.codekata;

import java.util.Scanner;

/*
 * 20.Generate multiplication table - 12 submission
 */
public class Program20 
{
	public void  generateMulti(int num,int mul)
	{
		long l=0;
		for(int i=0;i<=mul;i++)
		{
			l=num*i;
			System.out.println(l);
		}
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		Program20 program20=new Program20();
		program20.generateMulti(n, m);
		//System.out.println();
	}

}
