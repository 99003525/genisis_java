package com.ltts;

import java.util.Scanner;

class HotelRoom{
	protected String hotelName;
	protected int numberofSqFeet;
	protected Boolean hasTv;
	protected Boolean hasWifi;
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getNumberofSqFeet() {
		return numberofSqFeet;
	}
	public void setNumberofSqFeet(int numberofSqFeet) {
		this.numberofSqFeet = numberofSqFeet;
	}
	public Boolean getHasTv() {
		return hasTv;
	}
	public void setHasTv(Boolean hasTv) {
		this.hasTv = hasTv;
	}
	public Boolean getHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(Boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	public HotelRoom(String hotelName, int numberofSqFeet, Boolean hasTv, Boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberofSqFeet = numberofSqFeet;
		this.hasTv = hasTv;
		this.hasWifi = hasWifi;
	}
	
	public int calculateTariff(int costpersq) {
		
		return ((this.numberofSqFeet)*costpersq);
	}
	
	public int getRatePerSqFeet() {
		return 0;
	}
}


class Deluxeroom extends HotelRoom{
	protected int ratePerSqFeet;
	
	
	public Deluxeroom(String hotelName, int numberofSqFeet, Boolean hasTv, Boolean hasWifi) {
		super(hotelName, numberofSqFeet, hasTv, hasWifi);
		// TODO Auto-generated constructor stub
		this.ratePerSqFeet=10;
	}
	public int getRatePerSqFeet() {
		if(this.hasWifi) {
			return(ratePerSqFeet+2);
		}
		else {
			return(ratePerSqFeet);
		}
	}
	
}

class DeluxeAcRoom extends Deluxeroom{

	public DeluxeAcRoom(String hotelName, int numberofSqFeet, Boolean hasTv, Boolean hasWifi) {
		super(hotelName, numberofSqFeet, hasTv, hasWifi);
		this.ratePerSqFeet=12;
	}
	
}

class SuiteACRoom extends HotelRoom{
	
	private int ratePerSqFeet;
	public SuiteACRoom(String hotelName, int numberofSqFeet, Boolean hasTv, Boolean hasWifi) {
		super(hotelName, numberofSqFeet, hasTv, hasWifi);
		// TODO Auto-generated constructor stub
		this.ratePerSqFeet=15;
	}
	public int getRatePerSqFeet() {
		if(this.hasWifi) {
			return(ratePerSqFeet+2);
		}
		else {
			return(ratePerSqFeet);
		}
	}
}


public class HotelMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Hotel Tariff Calculator:");
	System.out.println("1. Deluxe Room \n 2. Deluxe AC Room \n 3. Suite AC Room ");
	System.out.println(" Select Room Type :");
	String choice = sc.next();
	
	switch(choice) {
	
		case "1" : 
				Deluxeroom dr=new Deluxeroom(choice, 0, null, null);
				
				System.out.println("Hotel Name :");
				String name=sc.next();
			    dr.setHotelName(name);
			    System.out.println("Room Square feet Area :");
			    int area=sc.nextInt();
			    dr.setNumberofSqFeet(area);
			    System.out.println("Room has Wifi ( yes/no )");
			    String wifi=sc.next();
				if(wifi.equals("yes")) {
					
						dr.setHasWifi(true);
					}
					else {
						dr.setHasWifi(false);
						}
				System.out.println("Room Tariff per day is:"+dr.calculateTariff(dr.getRatePerSqFeet()));

				break;
		case "2" : 
			
					DeluxeAcRoom ac=new DeluxeAcRoom(choice, 0, null, null);
					//DeluxeACRoom ac=new DeluxeACRoom();
					System.out.println("Hotel Name :");
					String name1=sc.next();
					ac.setHotelName(name1);
				    System.out.println("Room Square feet Area :");
				    int area1=sc.nextInt();
				    ac.setNumberofSqFeet(area1);
				    System.out.println("Room has Wifi ( yes/no");
				    String wifi1=sc.next();
				    if(wifi1.equals("yes")) {
						
						ac.setHasWifi(true);
					}
					else {
						ac.setHasWifi(false);
						}
					System.out.println("Room Tariff per day is:"+ac.calculateTariff(ac.getRatePerSqFeet()));

				    break;
			
		case "3" : 
					SuiteACRoom acr=new SuiteACRoom(choice, 0, null, null);
					
					System.out.println("Hotel Name :");
					String name2=sc.next();
					acr.setHotelName(name2);
				    System.out.println("Room Square feet Area :");
				    int area2=sc.nextInt();
				    acr.setNumberofSqFeet(area2);
				    System.out.println("Room has Wifi ( yes/no");
				    String wifi2=sc.next();
				    if(wifi2.equals("yes")) {
						
						acr.setHasWifi(true);
					}
						else {
						acr.setHasWifi(false);
						}	
					System.out.println("Room Tariff per day is: "+acr.calculateTariff(acr.getRatePerSqFeet()));

				    break;
	}
	
}
}
