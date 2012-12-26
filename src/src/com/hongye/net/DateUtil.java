package com.hongye.net;


public class DateUtil {

	/**
	 * str = " Sat Oct 06 22:00:00 CST 2012 " 这种形式
	 * @param str
	 * @return
	 */
	public static String convertDate(String str) {
		String[] dateElemts = str.trim().split(" ");
		StringBuilder sb = new StringBuilder();
		sb.append((dateElemts[dateElemts.length-1])).append("-").
			append(MonthEnum.getNumMonth(dateElemts[1])).
			append("-").append(dateElemts[2]);
		
		return  sb.toString();
	}
	
	
}
