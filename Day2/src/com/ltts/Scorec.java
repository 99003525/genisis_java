package com.ltts;

import java.util.Scanner;

public class Scorec {
		
		static int[] cricketer = new int[20];
		void findCricketID(int size , int threshold) {
			Scanner sc=new Scanner(System.in);
			int asize,aID,Ascore, Athresh;
			asize=size;
			Athresh=threshold;
			if(asize <0)
			{
				System.out.println("invalid array size");
				System.exit(0);
			}
			int arr[]=new int[asize];
	
				for(int i=0;i<asize;i=i+2)
				{
					System.out.println("enter the id:");
					 aID = sc.nextInt();
					 if( aID >0)
						 {
						 arr[i]=aID ;
						 System.out.println("enter score");
						 Ascore = sc.nextInt();
						 if(Ascore>0)
							 {
							 arr[i+1]=Ascore;
							 }
						 else
							 {
								 System.out.println("invalid score");
								 System.exit(0);
							 } 
						 }
					 else 
					 {
						 System.out.println("invalid array element");
						 System.exit(0);
				  }
				}
			//System.out.println("enter the threshold");
			//int thresh=sc.nextInt();
				for(int i=1;i<asize;i=i+2)
				{
					if(arr[i]>Athresh)
					{
						System.out.println(arr[i-1]);
					}
				}
		}
	public static void main(String[] args)
	{
		
		Scorec d= new Scorec();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		System.out.println("enter the threshold");
		int thresh=sc.nextInt();
		d.findCricketID(size,thresh);		
	}
	}

