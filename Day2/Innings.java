package com.ltts;

public class Innings {

	private String teamname;
	private String inningsname;
	private int runs;
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getInningsname() {
		return inningsname;
	}
	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public void DisplayInningsDetails() {
		System.out.println("Name:"+this.getTeamname());
		System.out.println("Scored:"+this.getRuns());
		String temp=(this.getInningsname());
		if(temp == "First") 
		{
			System.out.println("Need "+(this.getRuns()+1)+" to win");
		}
		else
		{
			System.out.println("Match Ended");
		}	
	}
	
}
