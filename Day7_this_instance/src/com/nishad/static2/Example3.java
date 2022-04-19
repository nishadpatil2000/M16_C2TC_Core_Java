package com.nishad.static2;

public class Example3 
{
	static int x;
	static String str;
	static
	{
		x=10;
		str="Nishad";
		for(int i=1;i<=7;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println(x);
		System.out.println(str);


	}

}
