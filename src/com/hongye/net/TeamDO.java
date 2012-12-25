package com.hongye.net;

import java.util.Date;

public class TeamDO {
	
	private String homeTeamName;
	private int homeTeamId;
	private String guestTeamName;
	private int guestTeamId;
	private String analayseLink;
	private Date compareTime;
	private String league; 
	
	
	public String getHomeTeamName() {
		return homeTeamName;
	}



	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}



	public int getHomeTeamId() {
		return homeTeamId;
	}



	public void setHomeTeamId(int homeTeamId) {
		this.homeTeamId = homeTeamId;
	}



	public String getGuestTeamName() {
		return guestTeamName;
	}



	public void setGuestTeamName(String guestTeamName) {
		this.guestTeamName = guestTeamName;
	}



	public int getGuestTeamId() {
		return guestTeamId;
	}



	public void setGuestTeamId(int guestTeamId) {
		this.guestTeamId = guestTeamId;
	}



	public String getAnalayseLink() {
		return analayseLink;
	}



	public void setAnalayseLink(String analayseLink) {
		this.analayseLink = analayseLink;
	}



	public Date getCompareTime() {
		return compareTime;
	}



	public void setCompareTime(Date compareTime) {
		this.compareTime = compareTime;
	}



	public String getLeague() {
		return league;
	}



	public void setLeague(String league) {
		this.league = league;
	}



	@Override
	public String toString() {
		return "[league="+league+",homeTeamName="+homeTeamName+",guestTeamName="+guestTeamName+",analayseLink="+analayseLink+"]";
	}
}
