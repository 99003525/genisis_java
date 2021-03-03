package com.ltts;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		
		String info;
		Customer c=new Customer();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name , contact no., address:");
		info=sc.next(); 
		/*System.out.println("enter the mobile :");
		String mobile=sc.next(); 
		System.out.println("enter the address :");
		String address=sc.next(); */
		
		String arr[]=info.split(",");
	
		c.setName(arr[0]);
		c.setMobile(arr[1]);
		c.setAddress(arr[2]);
		
		System.out.println("name : " +c.getName());
		System.out.println("contact no:"+c.getMobile());
		System.out.println("address :" +c.getAddress());
	}
	
}
