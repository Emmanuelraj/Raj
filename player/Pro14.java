package com.guvi.codekata.player;

public class Pro14 
{
	public void isReverseRemoveVowels(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		String s2="";
		for(int j=0;j<s1.length();j++)
		{
			if(!(s1.charAt(j)=='a'|s1.charAt(j)=='e'||s1.charAt(j)=='i'||s1.charAt(j)=='o'||s1.charAt(j)=='u'))
			{
				s2=s2+s1.charAt(j);
				
			//	System.out.println("output-->"+s2);
			}
		}
		System.out.println("output-->"+s2);
	}
	
	public static void main(String[] args) 
	{
	 Pro14 pro14=new Pro14();
	 
	 pro14.isReverseRemoveVowels("VowelsRemoved");
	 
	}

}
