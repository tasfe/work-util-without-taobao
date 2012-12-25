package com.hongye.net;

public enum MatchType {
	
	ALL_MATCH("���б���",0),
	LEAGUE_MATCH("����",1),
	CUP_MATCH("����",2),
	FRIENDLY_MATCH("������",3);
	
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
