package com.guvi.codekata.hunter;

import java.util.Scanner;

public class Pro72 
{
	
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String[]sarr=str.split(" ");
		String out="";
		String o1="";
		String o2="";
		for(int i=0;i<sarr.length;i++)
		{
			char[]c=sarr[i].toCharArray();
			 for(int j=c.length-1;j>=0;j--)
			 {
			    out=out+c[j];	 
			 }
		o1 =out+" ";
		}
		
		System.out.println(o1);
	}

}
