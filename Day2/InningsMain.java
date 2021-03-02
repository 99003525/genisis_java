package com.ltts;

import java.util.Scanner;

public class InningsMain {
	public static void main(String[] args) {
		Innings i=new Innings();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Team name: ");
		String name=s.next();
		System.out.println("enter the innings: ");
		String innings=s.next();
		System.out.println("enter the Team name: ");
		int runs=s.nextInt();
		
		i.setTeamname(name);
		i.setRuns(runs);
		i.setInningsname(innings);
		
		System.out.println("name"+i.getTeamname());
		System.out.println("session"+i.getInningsname());
		System.out.println("scored:"+i.getRuns());
		
	}
	
}