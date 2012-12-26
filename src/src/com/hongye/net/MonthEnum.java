package com.hongye.net;

import java.util.HashMap;
import java.util.Map;

public enum MonthEnum {
	
	JANUARY("Jan",1),    
	FEBRUARY("Feb",2),
	MARCH("Mar",3),
	APRIL("Apr",4),
	May("May",5),
	JUNE("Jun",6),
	JULY("Jul",7),
	AUGUST("Aug",8),
	SEPTEMBER("Sep",9),
	OCTOBER("Oct",10),
	NOVEMBER("Nov",11),
	DECEMBER("Dec",12);
	
	private String title;
	private int value;
	
	private MonthEnum(String title,int value){
		this.title = title;
		this.value = value;
	}
	
	private static volatile Map<String, Integer> map;

	static {
		Map<String, Integer> builder = new HashMap<String, Integer>();

		for (MonthEnum one : values()) {
			builder.put(one.title, one.value);
		}
		map = builder;
	}
	
	public static int getNumMonth(String title){
		return map.get(title);
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
