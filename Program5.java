package com.guvi.codekata;

import java.util.Scanner;

/*
 * 5.Find the largest number among three numbers entered by user - 71 submission
 */
public class Program5 {
	public  long findLargestNumber(int[]arr1)
	{
		long l=0;
		if(arr1[0]>arr1[1]&arr1[0]>arr1[2])
		{
			 l=arr1[0];
			 
		}
		else
			if(arr1[0]<arr1[1]&arr1[1]>arr1[2])
				
		{
			l=arr1[1];
		}
			else
			{
				l=arr1[2];		
			}
				
		
		return l;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Program5 prg=new Program5();
		int[] arr=new int[3];
		int count=0;
		for(int i=0;i<3;i++)
		{
		arr[count++]=scan.nextInt();
	
		}
		System.out.println(prg.findLargestNumber(arr));
		
		
	} 
	

}
