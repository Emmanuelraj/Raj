package com.guvi.codekata;

import java.net.NetworkInterface;
import java.util.Scanner;

/*4.Checker whether a character is an alphabet or not - 70 submission
 * 
 */

public class Program4 {
	public boolean isAlphabetOrNot(char[] c)
	{
		if(c.length==1)
		{
		for(int i=0;i<c.length;i++)
		{
			if(Character.isLetter(c[i]))
			{
				System.out.println("character isAlphabet");
				return true;
				
			}
		 }
		}
		
		
		return false;	
	}
	
public static void main(String[] args) {
	System.out.println("enter the character");
	Scanner sc1=new Scanner(System.in);
	   String str=sc1.nextLine();
	   
	Program4 program4=new Program4();
	char[]c=str.toCharArray();
	
	System.out.println(program4.isAlphabetOrNot(c));
	
	
}
}
