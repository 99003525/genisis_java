package com.ltts;

import java.util.Scanner;

public class EmployeeMain1 {
	

	public static void main(String[] args) {
		
		String arr[]= new String[10];
		Employee1 em=new Employee1();

		Scanner s=new Scanner(System.in);
		System.out.println("enter the name :");
		String name=s.next();  
		System.out.println("enter the address :");
		String address=s.next(); 
		System.out.println("enter the mobile :");
		String mobile=s.next();
		
	
		
		arr[0]=name;
		arr[1]=address;
		arr[2]=mobile;
		

	    em.setName(arr[0]);
	    em.setAddress(arr[1]);
		em.setMobile(arr[2]);
		
		System.out.println("Employee details:");
		System.out.println("Name :"+em.getName());
		System.out.println("Address :"+em.getAddress());
		System.out.println("Mobile :"+em.getMobile());
				
		while(true) {
		System.out.println("menu:");
		System.out.println("1. Update Employee name");
		System.out.println("2. Update Employee Address");
		System.out.println("3. Update Employee mobile");
		System.out.println("4. All information correct/Exit");
		System.out.println("5. Exit");

	
		System.out.println("choice");
			
		int choice=s.nextInt();
		switch (choice) {
		case 1 : 
			System.out.println("current name:"+ arr[0]);
			System.out.println("enter new name:");
			String namenew=s.next(); 
			arr[0]=namenew;
			break;
		case 2 :
			System.out.println("current Address:"+ arr[1] );
			System.out.println("enter new Address:");
			String newadd=s.next();
			arr[1]=newadd;
			break;
		case 3 :
			System.out.println("current contact no:"+ arr[2]);
			System.out.println("enter new contact no:");
			String newphone=s.next(); 
			arr[2]=newphone;
			break;
		case 4:
			System.out.println("Employee details:");
			System.out.println("Name :"+arr[0]);
			System.out.println("Address :"+ arr[1]);
			System.out.println("Mobile :"+ arr[2]);
		
			break;
		case 5:
			System.exit(0);
			break;
	
	  }
	}
	}
}
	

