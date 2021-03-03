package com.ltts;

import java.util.Scanner;

public class ArrFreq {

	void findelement() {
		Scanner sc=new Scanner(System.in);
		///System.out.println("enter the size of array ( anywhere between 1 to 20):");
		int asize=sc.nextInt();
		int arr[]=new int[asize];
		//System.out.println("enter the array elements:");
		int num;
		for(int i=0;i<asize;i++)
		{
		
			 num = sc.nextInt();
			 if( num<0)
			 {
				 System.out.println("invalid array element");
				 System.exit(i);
			 }
			 else {
				 arr[i]=num;
			 }
		 
		}
		//System.out.println("enter the element whose frequency needs to be counted");
		int n=sc.nextInt();
		int count=0;
		for (int i=0;i<asize;i++)
		{
			if (arr[i]==n)
			{
				count++;
			}
		}
		System.out.println(count);
	}
public static void main(String[] args)
{
	
	ArrFreq d=new ArrFreq();
	d.findelement();		
}
}
