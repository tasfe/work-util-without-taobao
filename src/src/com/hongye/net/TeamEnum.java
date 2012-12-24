package com.hongye.net;

import java.util.HashMap;
import java.util.Map;

public enum TeamEnum {
	
	MANUNIT("����",52),
	MANCHENG("����",216),
	QIEERXI("�ж���",60),
	RECI("�ȴ�",66),
	ASHENNA("��ɭ��",61),
	AIFUDUN("������",73),
	XIBULUOMUWEIQI("������ķά��",278),
	NUOWEIQI("ŵά��",291),
	STOKECITY("˹�п˳�",2997),
	SIWANGXI("˹����",7145),
	XIHANMU("����ķ",98),
	LIWUPOOL("������",93),
	MULEMU("����ķ",275),
	ASTNWEILA("��˹��ά��",70),
	NIUKASIER("Ŧ��˹��",63),
	SANDELAN("ɣ����",96),
	NANANPUDUN("�ϰ��ն�",94),
	WEIGANG("ά��",3265),
	QPR("Ů����԰Ѳ����",296),
	LEIDING("�׶�",3154);
	
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
