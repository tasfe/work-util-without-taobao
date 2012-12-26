package com.hongye.net;

import java.util.Date;

public class GameResultDO {
	
	private TeamDO homeTeam;
	private TeamDO guestTeam;
	
	private String analayseLink;
	private Date compareTime;
	private String league; 
	private boolean matchRst;
	private String gameRst;
	private String date;

	@Override
	public String toString() {
		return "[league="+league+",homeTeam="+homeTeam+
				",socre="+gameRst+
				",guestTeam="+guestTeam+
				",date="+date+
				",analayseLink="+analayseLink+"]";
	}


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

	public boolean isMatchRst() {
		return matchRst;
	}



	public void setMatchRst(boolean matchRst) {
		this.matchRst = matchRst;
	}

	public String getGameRst() {
		return gameRst;
	}



	public void setGameRst(String gameRst) {
		this.gameRst = gameRst;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
}
