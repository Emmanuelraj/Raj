package com.guvi.codekata.hunter;

import java.util.LinkedHashSet;
import java.util.Scanner;
/*
 * print all the characters present in the given string only once in a reverse order.
 *  Time & Space complexity should not be more than O(N). 
 *  e.g. 1)Given a string aabdceaaabbbcd the output should be ­ dcbae 2
 * )Sample String aaaabbcddddccbbdaaeee Output ­ eadbc 3)I/P aaafffcccddaabbeeddhhhaaabbccddaaaa O/P ­ adcbhef
 */
public class Pro88 
{
	
	
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		LinkedHashSet<String> ls=new LinkedHashSet<String>();
		char[] c=str.toCharArray();
		for(char c1:c)
		{
			String str1=""+c1;
			ls.add(str1);
		}
		//System.out.println(ls);
		String[] arr=new String[ls.size()-1];
		String str1="";
		for(String s:ls)
		{
		str1=str1+s;
		}
	//System.out.println(str1);
	StringBuffer sb=new StringBuffer(str1);
	sb.reverse();
	System.out.println(sb);
	
	}

}
