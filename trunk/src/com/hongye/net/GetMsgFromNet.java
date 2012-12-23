package com.hongye.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 从新浪获取比赛信息
 * @author hongyehwy
 *
 */
public class GetMsgFromNet {
	
	private static final String CODE = "gb2312";
	
	public static void getMsgFromRomteUrl(String urlStr){
		
		BufferedReader br = null;
		
		if(urlStr.isEmpty()){
			return;
		}
		
		try {
			URL urlBase = new URL(urlStr);
			
			br = new BufferedReader(new InputStreamReader(urlBase.openStream()));
			
			String inputLine;
			
			while((inputLine = br.readLine()) != null){
				if(inputLine.contains("")){
					System.out.println(inputLine);
				}
			}
			
		} catch (MalformedURLException e) {
			System.out.println("MalformedURLException,error = "+e.getMessage());
		} catch (IOException e){
			System.out.println("IOException,error = "+e.getMessage());
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("close BufferedReader error,msg = "+e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		String urlStr ="http://match.sports.sina.com.cn/football/team_iframe.php?year=2010&id=52";
		
		getMsgFromRomteUrl(urlStr);
	}
	
}

