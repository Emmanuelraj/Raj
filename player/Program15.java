package com.guvi.codekata.player;

import java.util.ArrayList;

/*
 * 
 * int[]arr={1,1,2,3,4,3,4,5,6};
 * 0/p-->=2,5,6
 */
public class Program15
{
	
 public static void main(String[] args) 
 {
	 ArrayList<Integer> al=new ArrayList<Integer>();
	 int count=0;
	int[]arr={1,1,2,3,4,3,4,5,6};
	int[]arr1=new int[0];
	//int al=
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
		}
		System.out.println(arr[i]);
 	
	}
	char c='A';
	int i=(int)c;
	System.out.println(i);
	int a,b,d;
	b=10;
	a=b=d=20;
	System.out.println(a);

 }
 }
