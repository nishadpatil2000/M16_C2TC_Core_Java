package com.indiabix.inheritance;

class Parent
{
	void print()
	{
		System.out.println("Hello,What are you doing?");
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("Child class");
	}
}


public class SingleInheritance 
{

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.display();
		c.print();

	}

}