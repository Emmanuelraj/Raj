package com.guvi.codekata;

import java.util.Scanner;

/*
 * 3.Check whether a character is vowel or consonant - 79 submission
 */
public class Program3 {
	public String isVowelOrNot(String s)
	
	{
		 String new1 =s.toLowerCase();
		 for(int i=0;i<new1.length();i++)
		 {
			 if(new1.charAt(i)=='a'|new1.charAt(i)=='e'|new1.charAt(i)=='i'|new1.charAt(i)=='o'|new1.charAt(i)=='u'|new1.charAt(i)==' ')
			 {
				 return "vowel";
			 }
		 
				}
		 return "consonent";
	}
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Program3 program3=new Program3();
		System.out.println("enter the input string");
		String s=scanner.nextLine();
		System.out.println(program3.isVowelOrNot(s));
	}

}
