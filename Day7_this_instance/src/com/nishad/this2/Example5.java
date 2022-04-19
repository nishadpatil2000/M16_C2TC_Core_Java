package com.nishad.this2;

public class Example5 
{
	int x;
	Example5()
	{
		this(25);
		System.out.println("Nishad");
	}
	Example5(int x)
	{
		this.x=x;
		System.out.println("Haresh");
	}
	

	public static void main(String[] args) {
		Example5 e=new Example5(35);

	}

}
