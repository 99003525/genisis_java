package com.ltts;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CompanyMain {
public static void main(String[] args) {
	
	String t;
	Company l=new Company();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Company Name:");
	String name=sc.next();
	l.setName(name);
	System.out.println("Enter employees:");
	t=sc.next();
	String arr[]=t.split(",");
	List<String> list=Arrays.asList(arr);///convert list to array
	System.out.println("enter the teamlead:");
	String lead=sc.next();
	l.setTeamlead(lead);
		if(list.contains(lead))
				{
			System.out.println("teamlead:"+l.getTeamlead());
		}
		else {
			System.out.println("invalid input");
			System.exit(0);
		}
	}
}
