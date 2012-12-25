package com.hongye.net;

import java.util.Date;

public class GameResultDO {
	
	private TeamDO homeTeam;
	private TeamDO guestTeam;
	
	private String analayseLink;
	private Date compareTime;
	private String league; 
	private boolean matchRst;
	private int score;


	public TeamDO getHomeTeam() {
		return homeTeam;
	}



	public void setHomeTeam(TeamDO homeTeam) {
		this.homeTeam = homeTeam;
	}



	public TeamDO getGuestTeam() {
		return guestTeam;
	}



	public void setGuestTeam(TeamDO guestTeam) {
		this.guestTeam = guestTeam;
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
		return "[league="+league+",homeTeam="+homeTeam+",guestTeam="+guestTeam+",analayseLink="+analayseLink+"]";
	}



	public boolean isMatchRst() {
		return matchRst;
	}



	public void setMatchRst(boolean matchRst) {
		this.matchRst = matchRst;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}
}
