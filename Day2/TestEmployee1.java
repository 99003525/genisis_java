package com.ltts;

public class TestEmployee1 {
	//default constructor
	
	TestEmployee1() // constructor has no return type but can have access specifier 
	{
		System.out.println("default constructor");
	}
	// parameterized constructor
	TestEmployee1(int a){
		System.out.println(" value of a is "+a);
	}
	public static void main(String[] args) {
		TestEmployee1 t=new TestEmployee1(10);
		TestEmployee1 t1=new TestEmployee1(200);
	}
}
