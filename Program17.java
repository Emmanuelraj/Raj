package com.guvi.codekata;
/*17.Check armstrong number - 13 submission
 * 
 */

public class Program17 {
	public void isArmStrong(int num)
	{
		int arms=0;
		String s=""+num;
		int len=s.length();
		int num1=Integer.parseInt(s);
		while(num1>0)
		{
			int rem=num1%10;
		  arms+=(int)Math.pow(rem, len);
		  num1=num1/10;
		}
		System.out.println("arms-->"+arms);
		if(arms==num)
		{
			System.out.println("arm");
		}
		else
		System.out.println("not arms");
	}
	
	public static void main(String[] args) {
		Program17 program17=new Program17();
		program17.isArmStrong(371);
	}

}
