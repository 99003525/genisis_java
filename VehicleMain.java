package com.ltts;

import java.util.Scanner;

class Vehicle
{
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) { 
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public Vehicle( String make,String vehicleNumber, String fuelType,int fuelCapacity,int cc) {
		this.make=make;
		this.vehicleNumber=vehicleNumber;
		this.fuelType=fuelType;
		this.fuelCapacity=fuelCapacity;
		this.cc=cc;
	}
	void displayMake(String make)
	{
		
		System.out.println("Make"+(this.make));
		
	}
	public void displayBasicInfo()
	{
		System.out.println("***"+this.make+"**");
		System.out.println("basic information of vehicle :");
		System.out.println("Vehicle number:"+(this.vehicleNumber));
		System.out.println("Fuel Capacity"+(this.fuelCapacity));
		System.out.println("fuel Type"+(this.fuelType));
		System.out.println("CC:"+this.cc);
	}
	public void displayDetailInfo()
	{
		
	}
	
}

class Twowheeler extends Vehicle{


	public Twowheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
	}


	private Boolean kickStartAvailable;
	
	public Boolean getKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(Boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	public void displayDetailInfo(Boolean kickStartAvailable)
	{
		System.out.println("Detailed information:"+kickStartAvailable);
	}
}

class FourWheeler extends Vehicle{
	
	

	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
	}


	private String audioSystem;
	private int numberofDoors;
	public String getAudioSystem() {
		return audioSystem;
	}

	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}

	public int getNumberofDoors() {
		return numberofDoors;
	}

	public void setNumberofDoors(int numberofDoors) {
		this.numberofDoors = numberofDoors;
	}

	 
	public void displayDetailInfo() {
		
	}
}

public class VehicleMain {
public static void main(String[] args) {
	
	Twowheeler t=new Twowheeler();  
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Vehicle type : 1 for four wheeler and 2 for two wheeler");
	int choice=sc.nextInt();
	if (choice == 1) {
	System.out.println("Vehicle Make :");
	String make=sc.next();
	
	 
	}
	else {
		
	}
}
}
