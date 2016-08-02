package com.guvi.codekata.hunter;

import java.util.Scanner;

/*
 * .Given a string, 
 * we need to check if a string is a double string possibly by deleting a character.
 *  A double string is a repetition of two strings affixed together. 
 * For example the following strings are double strings "aa", "meme", "abbabb"
 *  Where as the follwing are not double strings "ab", "abc", "acbab" 
 */
public class Pro35 
{
	
	
	
	
	
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	String str=scan.nextLine();
	if(str.length()%2==0)
	{
		String first=str.substring(0,str.length()/2);
		System.out.println(first);
		String last=str.substring(str.length()/2,str.length());
		System.out.println(last);
		if(first.equals(last))
		{
			System.out.println("double");
		}
		else
		{
			System.out.println("not double");
		}
	}else 
		 if(str.length()%2!=0)
		{
			String first=str.substring(0,str.length()/2);
			System.out.println(first);
			String last=str.substring(str.length()/2+1, str.length());
			System.out.println(last);
			char c=str.charAt(str.length()/2);
		    String op="";
			if(first.equals(last))
			{
				
				System.out.println("double");
				System.out.println("removechar-->"+c);
			}else
			{
				System.out.println("not double");
			}
			
		}
	 	
	}

}
