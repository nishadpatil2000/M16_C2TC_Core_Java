package com.indiabix.abstract2;


class Parent5
{
	Parent5()
	{
		System.out.println("Parent-5");
	}
}
class Child5 extends Parent5
{
	Child5()
	{
		super();
		System.out.println("Child-5");
		
	}
}
public class Example7 {

	public static void main(String[] args) {
		Child5 c=new Child5();
		
		

	}

}