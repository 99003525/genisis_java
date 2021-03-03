package com.ltts;
class Parent1{
	
	void display1(){
		System.out.println("parent1");
	}
}

interface parent2{
	void display2();

}

class subcl extends Parent1 implements parent2{
	void show() {
		System.out.println();
	}
	public void display2()
	{
		System.err.println("interface method");
	}
}
public class MultipleInher {
public static void main(String[] args) {
	subcl c=new subcl();
	c.display1();
	c.display2();

}
}
