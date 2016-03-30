package com.guvi.codekata;
/*
 * 26.Print all the ASCII value using loops - 12 submission
 */
public class Program23 
{
	public void printAscii(char a)
	{
		int c=0;
		char d=' ';
		for (int i = 1; i < 26; i++) 
		{
			d=(char)a;
			
		}
		
		System.out.println(d);
	}
  
	public static void main(String[] args) 
	{
		Program23 pr=new Program23();
		char c=96;
		pr.printAscii(c);
	
    }
  
}
