package com.ltts;

class Test{
	//private int a=10;
	protected int a=10;
	void display() {
		//System.out.println(a);
		System.out.println(this.a);
	}
}

class testchild extends Test{
	int b=20;
	void display1() {
		//int b=20;
		//System.out.println(a);// error if a is private and be accessed in test class only
		System.out.println(this.b); //b=20
		System.out.println(super.a);//a=10
	}
}
public class demo1 {
	public static void main(String[] args) {
		testchild c=new testchild();
		c.display();
		c.display1();
	}
	
}
