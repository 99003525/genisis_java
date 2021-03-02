package com.ltts;

import java.util.Scanner;

public class ScoreCheck {
	
	static int[] cricketer = new int[20];
	void findCricketID() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int asize=sc.nextInt();
		if(asize <0)
		{
			System.out.println("invalid array size");
			System.exit(0);
		}
		int arr[]=new int[asize];
		int id,score;
		//System.out.println("enter the id:");
		  	for(int i=0;i<asize;i=i+2)
			{
				//System.out.println("enter the id:");
				 id = sc.nextInt();
				 if( id>0)
					 {
					 arr[i]=id;
					 //System.out.println("enter score");
					 score = sc.nextInt();
					 if(score>0)
						 {
						 arr[i+1]=score;
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
		System.out.println("enter the threshold");
		int thresh=sc.nextInt();
			for(int i=1;i<asize;i=i+2)
			{
				if(arr[i]>thresh)
				{
					System.out.println(arr[i-1]);
				}
			}
	}
public static void main(String[] args)
{
	
	ScoreCheck d=new ScoreCheck();
	d.findCricketID();		
}
}
