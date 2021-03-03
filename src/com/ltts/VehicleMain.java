package com.ltts;

import java.util.Scanner;

class Vehicle{
	private String make;
	private String vehicleNumber;
	private String fuelType;
	private int fuelCapacity;
	private int cc;
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
		
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	public void displayMake(){
		
		System.out.println("***"+(this.make)+"***");
	}
	
	public void displayBasicInfo() {
		System.out.println("--Basic Information--");
		System.out.println(this.vehicleNumber);
		System.out.println(this.fuelCapacity);
		System.out.println(this.fuelType);
		System.out.println(this.cc);
	}
	public void displayDetailInfo() {
		
		
	}
	
}

class TwoWheeler extends Vehicle{
	
	private boolean kickStartAvailable;

	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
			boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	
	public void displayDetailInfo() 
	{
		if (this.kickStartAvailable) 
		{
			System.out.println("KickStart Available : YES");
		} else {
			System.out.println("Kick Start: NO");
		}
	}
}

class FourWheeler extends Vehicle{

	private String audioSystem;
	private int numberOfDoors;
	
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem,
			int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}

	
	
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	public void displayDetailInfo() {
		System.out.println("Audio sytem: "+(this.audioSystem));
		System.out.println("Number of doors: "+(this.numberOfDoors));
	}
}
public class VehicleMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Four Wheeler \n2. fwo Wheeler");
		String choice = sc.next();
		
		switch(choice) {
		case "1":
			FourWheeler fw = new FourWheeler(choice, choice, choice, 0, 0, choice, 0);
			
			System.out.println("Vehicle Make: ");
			String make = sc.next();
			fw.setMake(make);
			
			System.out.println("Vehicle Number: ");
			String num = sc.next();
			fw.setVehicleNumber(num);
			
			System.out.println("Fuel Type:\n1. Petrol\n2. Diesel");
			String fueltype = sc.next();
			switch(fueltype) {
			case "1":
				String ftpt = "Petrol";
				fw.setFuelType(ftpt);
				break;
			case "2":
				String ftdl = "Diesel";
				fw.setFuelType(ftdl);
				break;
			default:
				break;
			}
			
			System.out.println("Fuel Capacity: ");
			int fuelcap = sc.nextInt();
			fw.setFuelCapacity(fuelcap);
			
			System.out.println("Engine CC: ");
			int enginecc = sc.nextInt();
			fw.setCc(enginecc);
			
			System.out.println("Audio System: ");
			String audiosys = sc.next();
			fw.setAudioSystem(audiosys);
			
			System.out.println("Number of doors: ");
			int doors = sc.nextInt();
			fw.setNumberOfDoors(doors);
			
			System.out.println("***"+fw.getMake()+"***");
			System.out.println("---Basic Information---");
			System.out.println("Vehicle Number: "+fw.getVehicleNumber());
			System.out.println("Fuel Capacity: "+fw.getFuelCapacity());
			System.out.println("Fuel Type: "+fw.getFuelType());
			System.out.println("CC: "+fw.getCc());
			System.out.println("---Detailed Information---");
			System.out.println("Audio System: "+fw.getAudioSystem());
			System.out.println("Number of Doors: "+fw.getNumberOfDoors());
		
			break;
			
		case "2":
			TwoWheeler tw = new TwoWheeler(choice, choice, choice, 0, 0, false);
			
			System.out.println("Vehicle Make: ");
			String make1 = sc.next();
			tw.setMake(make1);
			
			System.out.println("Vehicle Number: ");
			String num1 = sc.next();
			tw.setVehicleNumber(num1);
			
			System.out.println("Fuel Type:\n1. Petrol\n2. Diesel");
			String fueltype1 = sc.next();
			switch(fueltype1) {
			case "1":
				String typpet = "Petrol";
				tw.setFuelType(typpet);
				break;
			case "2":
				String typdl = "Diesel";
				tw.setFuelType(typdl);
				break;
			default:
				break;
			}
			
			System.out.println("Fuel Capacity: ");
			int twfcp = sc.nextInt();
			tw.setFuelCapacity(twfcp);
			
			System.out.println("Engine CC: ");
			int twencc = sc.nextInt();
			tw.setCc(twencc);
			
			System.out.println("Kick Start Available(yes/no): ");
			String twks = sc.next();
			switch(twks) {
			case "yes":
				tw.setKickStartAvailable(true);
				break;
			case "no":
				tw.setKickStartAvailable(false);
				break;
			default:
				break;
			}
			
			
			System.out.println("***"+tw.getMake()+"***");
			System.out.println("---Basic Information---");
			System.out.println("Vehicle Number: "+tw.getVehicleNumber());
			System.out.println("Fuel Capacity: "+tw.getFuelCapacity());
			System.out.println("Fuel Type: "+tw.getFuelType());
			System.out.println("CC: "+tw.getCc());
			System.out.println("---Detail Information---");
			System.out.println("Kick Start Available: "+tw.isKickStartAvailable());
			
		default:
			break;
		}
	}
}
