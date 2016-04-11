package com.guvi.codekata.player;

import java.util.Scanner;

/*
 * 24.Validate if a given string is numeric  Some examples: 
 *  '0'=>true  '0.1'=>true 
 *   'abc'=>false  
 *   '1 a' =>false  
 *   '2e10' =>true. 
 */
public class ProPlayer24 
{
	
	public static void main(String[] args) 
	{
	System.out.println("enter ur input");
	Scanner scan=new Scanner(System.in);
	String s=scan.nextLine();
	char[]c=s.toCharArray();
	boolean flag=false;
	for(int i=0;i<c.length;i++)
	{
		if(c[i]=='0'||c[i]=='1'||c[i]=='2'||
				c[i]=='3'||c[i]=='4'||c[i]=='5'||
				c[i]=='6'||c[i]=='7'||c[i]=='8'||
				c[i]=='9'||c[i]=='.'||c[i]=='e')
		{
	     flag=true; 
		}
	}
	if(flag==true)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}

		
	}

}
