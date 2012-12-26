package com.hongye.net;

public class TeamDO {

	private String teamName;
	private int teamId;
	
	public TeamDO() {}

	public TeamDO(String teamName) {
		this.teamName = teamName;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	@Override
	public String toString() {
		return "(name:"+teamName+";id:"+teamId+")";
	}
	
}
