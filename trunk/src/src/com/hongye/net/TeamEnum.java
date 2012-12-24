package com.hongye.net;

import java.util.HashMap;
import java.util.Map;

public enum TeamEnum {
	
	MANUNIT("曼联",52),
	MANCHENG("曼城",216),
	QIEERXI("切尔西",60),
	RECI("热刺",66),
	ASHENNA("阿森纳",61),
	AIFUDUN("埃弗顿",73),
	XIBULUOMUWEIQI("西布罗姆维奇",278),
	NUOWEIQI("诺维奇",291),
	STOKECITY("斯托克城",2997),
	SIWANGXI("斯旺西",7145),
	XIHANMU("西汉姆",98),
	LIWUPOOL("利物浦",93),
	MULEMU("富勒姆",275),
	ASTNWEILA("阿斯顿维拉",70),
	NIUKASIER("纽卡斯尔",63),
	SANDELAN("桑德兰",96),
	NANANPUDUN("南安普顿",94),
	WEIGANG("维冈",3265),
	QPR("女王公园巡游者",296),
	LEIDING("雷丁",3154);
	
	private String name;
	private int code;
	
	private TeamEnum(String name,int code) {
		this.name = name;
		this.code = code;
	}
	
	private static volatile Map<String, Integer> map;

	static {
		Map<String, Integer> builder = new HashMap<String, Integer>();

		for (TeamEnum one : values()) {
			builder.put(one.name, one.code);
		}
		map = builder;
	}
	
	
	public int getCode(String name){
		return map.get(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
}
