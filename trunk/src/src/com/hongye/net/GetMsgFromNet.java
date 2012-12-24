package com.hongye.net;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 从新浪获取比赛信息
 * @author hongyehwy
 *
 */
public class GetMsgFromNet {
	
	private static final String CODE = "gb2312";
	
	public static void main(String[] args) {
		String urlStr ="http://match.sports.sina.com.cn/football/team_iframe.php?year=2010&id=52";
		
		String toMatch ="http://caipiao.taobao.com";
		
		String lotteryAnalyseUrl = "http://www.tao123.com/html/caipiao/";
		
//		getHistoryMatch(urlStr);
		
//		getToMatchGamer(toMatch);
		
		analyseLottery(lotteryAnalyseUrl);
	}
	
	public static void analyseLottery(String lotteryAnalyseUrl){
		URL urlBase;
		try {
			urlBase = new URL(lotteryAnalyseUrl);
			Document doc = Jsoup.parse(urlBase, 10000);
			
			Element link = doc.select("a").first();
			
			String linkHref = link.attr("href");
			
			System.out.println(linkHref);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 历史交战记录
	 * @param urlStr
	 */
	public static void getHistoryMatch(String urlStr){
		URL urlBase;
		try {
			urlBase = new URL(urlStr);
			Document doc = Jsoup.parse(urlBase, 10000);
			
			Element content = doc.getElementById("sub01_c1");
			
			Elements trs = content.getElementsByTag("tr");
			
			for(Element tr : trs){
				System.out.println(tr.text());
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 将要比赛的场次
	 * @param urlStr
	 */
	public static void getToMatchGamer(String urlStr){
		URL urlBase;
		try {
			urlBase = new URL(urlStr);
			Document doc = Jsoup.parse(urlBase, 10000);
			
			Elements links = doc.select("ul.racelist");
//			Elements links = doc.select("span.vs");
			
			String[] el = links.text().split("竞彩");
			
			for(String e : el){
				if(e.contains("英 超"))
				System.out.println(e);
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

