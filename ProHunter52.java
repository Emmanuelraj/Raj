package com.guvi.codekata.hunter;

import java.util.Scanner;

/*
 * .There are n stairs, a person standing at the bottom wants to reach the top. 
 * The person can climb either 1 stair or 2 stairs at a time.
 *  Count the number of ways, the person can reach the top
 */
public class ProHunter52 
{
	
	
	
	public static void main(String[] args) 
	{ System.out.println("enter the length");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("entere the elemnts");
		int[]arr=new int[n];
		int onestair=0;
		int secstair=0;
		for(int i=0;i<n;i++)
		{
			
			arr[i]=scan.nextInt();
		}
	
		for(int i=0;i<arr.length;i++)
		{
			i++;
			onestair++;
			
			
		}
		System.out.println("onestair-->"+onestair);
		for(int i=2;i<arr.length;i+=2)
		{
			i++;
			secstair++;
			
			
		}
		System.out.println("secstair-->"+secstair);
		
	}

}
