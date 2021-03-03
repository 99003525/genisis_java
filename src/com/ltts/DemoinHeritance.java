package com.ltts;

class Parent 
{
	void DisplayInfo()
	{
		System.out.println("parent class method");
	}
}

class Child extends Parent // syntax : class child_name extends parent_name
{
	void GetInfo()
	{
		System.out.println("child class method");
	}
}

public class DemoinHeritance 
{

	public static void main(String[] args) {
		Child c=new Child();
		c.DisplayInfo();
		c.GetInfo();
	}
}
