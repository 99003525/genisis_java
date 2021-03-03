package com.ltts;

import java.util.Scanner;

public class EmployeeMain {
public static void main(String[] args) {
	Employee e=new Employee();
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter the name :");
	String name=s.next(); 
	System.out.println("enter the mobile :");
	String mobile=s.next(); 
	System.out.println("enter the address :");
	String address=s.next(); 
	
	e.setName(name);
	e.setMobile(mobile);
	e.setAddress(address);
	System.out.println("Employee details:");
	System.out.println("Name :"+e.getName());
	System.out.println("Mobile :"+e.getMobile());
	System.out.println("Address :"+e.getAddress());

}
}
