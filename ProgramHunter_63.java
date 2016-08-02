package com.guvi.codekata.hunter;

import java.util.ArrayList;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/*
 *on the right side in the array. 
 *Replace last element with 0 as there no element on the right side of it.
 * eg. if the array is {6, 7, 4, 3, 5, 2}, output {7, 5, 5, 5, 2, 0}
 */
public class Program63 {

	public static void main(String[] args) 
	{
		System.out.println("enter the length");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("enter the elements");
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		int[]arr1=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]<=arr[j])
				{
					arr[i]=arr[j];
					
					
					
				}
			}
	//System.out.println(arr[i]);
		}
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<arr.length;i++)
		{
			al.add(arr[i]);
		}
		
		int a=0;
		al.add(a);
		System.out.println(al);
	}
	
	
}
