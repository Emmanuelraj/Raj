package com.guvi.codekata.hunter;

/*
 * ex:findUnique([1, 2, 6, 9, 9, 1, 3, 6, 2]) 
returns: 3

ex: findUnique([12, 45, 32, 65, 32, 65, 45])
returns: 12 
 */
public class Pro6 
{
	
	public static void main(String[] args) 
	{
		
		int[] arr={1, 2, 6, 9, 9, 1, 3, 6, 2};		
				for(int i=0;i<arr.length;i++)
				{
					for(int j=i+1;j<arr.length;j++)
					{
						if(arr[i]>arr[j])//for ascending
						{
							int temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
					
				}
				for(int i=0;i<arr.length-1;i++)
				{
					if(arr[i]==arr[i+1])
					{
						i++;
						
					}
					else
					{
						System.out.println(arr[i]);
						
					}
				}
		
	}
	
	

}
