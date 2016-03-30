package com.guvi.codekata;

import java.util.Scanner;

/*11.Calculate the power of a number. - 20 submission
 * 
 */
public class Program11 {
	
	public int calculatePowerOfNUmber(int m,int n) 
	
	{
	int t=1;
	for(int i=0;i<n;i++)
	{
		t=t*m;
	}
	return t;
	}
	public static void main(String[] args) {
		System.out.println("enter the values to be square");
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		System.out.println("times to be power ");
		int n=scan.nextInt();
		Program11 pr=new Program11();
		System.out.println(pr.calculatePowerOfNUmber(m,n));
		
				
	}
	 

}
