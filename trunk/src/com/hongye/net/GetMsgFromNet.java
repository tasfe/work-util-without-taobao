package com.hongye.net;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *  @author hongyehwy
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
		
//		analyseLottery(lotteryAnalyseUrl);
		
//		getSinaAnalyseUrl();
		
	}
	
	private static void analyseCompare(){
		String url = "http://live.sina.aicai.com/xiyaou/datan!getDatanMatchInfo.jhtml?betId=711098";
		URL urlBase;
		try {
			urlBase = new URL(url);
			Document doc = Jsoup.parse(urlBase, 10000);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	private static TeamDO fomatInput(String input){
		String[] tmp = input.split(" ");
		
		TeamDO teamDO = new TeamDO();
		teamDO.setLeague(tmp[0]);
		teamDO.setHomeTeamName(tmp[3]);
		teamDO.setGuestTeamName(tmp[5]);
		teamDO.setAnalayseLink(tmp[tmp.length-1]);
		
//		System.out.println(teamDO);
		
		return teamDO;
	}
	
	private static List<TeamDO> getSinaAnalyseUrl(){
		List<TeamDO> rst = new ArrayList<TeamDO>();
		String url = "http://sina.aicai.com/jczq/";
		try {
			URL urlBase = new URL(url);
			Document doc = Jsoup.parse(urlBase, 10000);

			Elements links = doc.select("tr[id*=jq_gudingspf_match_121226]");
//			Elements links = doc.select("td:contains(jq)");
//			Elements links = doc.select("span.blue");
			
			for(Element e: links){
//				
//				Elements s = e.select("td.scbg2");
				if(e.text().contains("Ó¢³¬")){
					String tmp = e.text()+" "+e.select("a").first().attr("href");
//					System.out.println(e.text()+" "+e.select("a").first().attr("href"));
					rst.add(fomatInput(tmp));
				}
				
			}
			
			return rst;
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * 	 * @param baseUrl
	 */
	private static void getLotteryAnalyseUrl(String baseUrl){
		URL urlBase;
		try {
			urlBase = new URL(baseUrl);
			Document doc = Jsoup.parse(urlBase, 10000);
			
			Elements links = doc.select("a[href*=/bjdc/]");
			if(links == null){
				return ;
			}
			
			Element e = links.get(0);
			String accUrl = e.attr("href");
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void analyseLottery(String lotteryAnalyseUrl){
		URL urlBase;
		try {
			urlBase = new URL(lotteryAnalyseUrl);
			Document doc = Jsoup.parse(urlBase, 10000);
			
			Elements links = doc.select("a[href*=/bjdc/]");
			if(links == null){
				return ;
			}
			
			Element e = links.get(0);
			String accUrl = e.attr("href");
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * get history of game
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
	 * return to match game
	 * @param urlStr
	 */
	public static void getToMatchGamer(String urlStr){
		URL urlBase;
		try {
			urlBase = new URL(urlStr);
			Document doc = Jsoup.parse(urlBase, 10000);
			
			Elements links = doc.select("ul.racelist");
			
			String[] el = links.text().split("");
			
			for(String e : el){
				if(e.contains(""))
				System.out.println(e);
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

