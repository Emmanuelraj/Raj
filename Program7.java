package com.guvi.codekata;

import java.util.Scanner;
import java.util.jar.Manifest;
/*7.Write a program to print 'Hello' word 5 times. - 41 submission
 * 
 */
public class Program7 {
	public void printFive(String s)
	{	String s1="";
		for (int i = 0; i < 5; i++) {
		 s1=""+s;
		System.out.println(s1);
		}
		
	}
 public static void main(String[] args) {
	 System.out.println("enter the 5 times");
	 Scanner  scanner=new Scanner(System.in);
	 String s=scanner.nextLine();
	 
	Program7 program7=new Program7();
	
	program7.printFive(s);
	//System.out.println(s1.toString());
}

}
