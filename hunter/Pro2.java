package com.guvi.codekata.hunter;



import java.util.ArrayList;
import java.util.Scanner;

/*
 * {10,20,50,20,30,60,10}
 * {10,20}
 */
public class Pro2
{
	public static void main(String[] args)
	{
		int n,p,temp;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int ar1[]=new int[n];
		for(int i=0;i<n;i++)
		ar1[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		for(int j=i+1;j<n;j++)
		{
		if(ar1[i]>ar1[j])
		{
		temp=ar1[i];
		ar1[i]=ar1[j];
		ar1[j]=temp;
		}
		}
		}
		for(int i=0;i<ar1.length;i++)
		{
			if(ar1[i]==ar1[i+1])
			{
				System.out.println(ar1[i]);
			}
		}
	}
	

}
