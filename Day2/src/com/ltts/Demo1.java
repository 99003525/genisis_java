package com.ltts;

public class Demo1 
{
	int a=10;		//data member or property  // instance variable : variable defined inside of class but outside the methods
	int b=20;
	
	static int c=15; //static variable : memory of the variable does not change
	
	void displayInfo()	//normal method
	{
		int a=100,b=200; // local variable , has higher priority than instance variable
		System.out.println(a+b);
		System.out.println(c);
		c++;
		System.out.println(c);
	}
	/*
	 * void showInfo()
	{
		System.out.println("show information");
	}
	*/
	public static void main(String[] args) //main method
	{
		Demo1 d=new Demo1(); // 'd' is the object of class Demo1 
		Demo1 d1=new Demo1(); // 'd1' is the object of class Demo1 
		//d.a=10;
		//d.b=20;
		d.displayInfo(); //300,15,16
		//d.showInfo(); // show information
		//d1.showInfo();
		d1.displayInfo();//300,16,17
	}

}
