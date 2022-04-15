package com.indiabix.abstract2;

abstract class A
{
	abstract void print();
	int a;
	
}
class B extends A
{
	void print()
	{
		System.out.println("Welcome to India");
	}
}
public class Example1 {

	public static void main(String[] args) {
		B obj=new B();
		obj.print();

	}

}