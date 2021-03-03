package com.ltts;

class baseparent
{
	void DisplayInfo()
	{
		System.out.println("parent class method");
	}
}

class subchild extends baseparent// syntax : class child_name extends parent_name
{
	void GetInfo()
	{
		System.out.println("child class method");
	}
}

class ChildChild extends subchild
{
	void showInfo()
	{
		System.out.println("childchild class method");
	}
}

public class MultilevelInheritance {
		public static void main(String[] args) {
		ChildChild c=new ChildChild();
		c.DisplayInfo();
		c.GetInfo();
	}
}
