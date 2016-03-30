package com.guvi.codekata.hunter;

import java.util.Scanner;

/*
 * 10.Write a function to reverse the order of words in a string in place. - 8 submission
 */
public class Pro10
{
	public void reverseTheWordsPos(String s)
	{
		
		String s2="";
		String s1="";
		String s3="";
		
		String []str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			//System.out.println(str[i]);
		s3="";
			
			 for(int j=str[i].length()-1;j>=0;j--)
			 {
				s3+=str[i].charAt(j);
			 }
			 System.out.print(s3+" ");	 
		
		}
		
		
	
		
	}
	public static void main(String[] args)
	{
		System.out.println("enter the String");
	 Scanner sc1=new Scanner (System.in);
	 String s=sc1.nextLine();
	 Pro10 pro10=new Pro10();
	 pro10.reverseTheWordsPos(s);
	
	}
	

}
