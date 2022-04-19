package com.nishad.this2;

public class Example3 
{
	void accept(Example3 obj)
	{
		System.out.println("Welcome to India");
	}
	void print()
	{
		accept(this);
	}

	public static void main(String[] args) {
		Example3 e=new Example3();
		e.print();

	}

}
