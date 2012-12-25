package com.hongye.net;

public enum MatchType {
	
	ALL_MATCH("所有比赛",0),
	LEAGUE_MATCH("联赛",1),
	CUP_MATCH("杯赛",2),
	FRIENDLY_MATCH("友谊赛",3);
	
	private String name;
	private int type;
	
	private MatchType(String name,int type){
		this.setName(name);
		this.setType(type);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
}
