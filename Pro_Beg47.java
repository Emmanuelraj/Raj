package com.guvi.codekata;

import java.util.Scanner;

public class Pro_Beg47
{
	
	public static void main(String[] args)
	{
	 System.out.println("enter the len");
	 Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
	 int[]arr=new int[n];
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=scan.nextInt();
	 }
	 for(int i=0;i<arr.length;i++)
	 {
		 for(int j=i+1;j<arr.length;j++)
		 {
			 if(arr[i]>=arr[j])
			 {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
		 }
		
	 }
	 System.out.println("smallest is-->"+arr[0]+"and"+arr[arr.length-1]+"<--largest");
	 
	}

}
