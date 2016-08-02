package com.guvi.codekata.hunter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ProHunt60 
{
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("enter the length");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("enter the k");
		int k=scan.nextInt();
		System.out.println("entere the elemnts");
		int[]arr=new int[n];
		int onestair=0;
		int secstair=0;
		for(int i=0;i<n;i++)
		{
			
			arr[i]=scan.nextInt();
		}
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		for(int s:arr)
		{
			ls.add(s);
		}
		System.out.println("sorted array"+ls);
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
	}
}
