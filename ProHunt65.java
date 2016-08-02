package com.guvi.codekata.hunter;

import java.util.ArrayList;
import java.util.Scanner;
// An array of integers is given.The given element is removed new array is returned. 
//input1:{10,10,20,30,76} output: {20,20,76}(10 is asked to remove) 
public class Pro65 {
	
	public static void main(String[] args)
	{
		
		System.out.println("enter the length");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=scan.nextInt();
		}
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i:arr)
		{
			if(i!=10)
			{
			al.add(i);
			}
		}
		System.out.println(al);
	}

}
