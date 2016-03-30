package com.guvi.codekata;

import java.util.Scanner;

/*6.Check whether the entered year is leap year or not - 70 submission
 * 
 */
public class Program6 {
	public String isLeapYear(int days ,int months )
	{
	if(days==366&&months==12)
	{
		return "leapyear";
	}
	return "not leapyear";
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the days");
		int day=scanner.nextInt();
		System.out.println("Enter the months");
		int month=scanner.nextInt();
		System.out.println("Enter the month in february");
		
		Program6 pr=new Program6();
		
		String s=pr.isLeapYear(day, month);
		System.out.println(s);
	}
	

}
