package com.khaledbaghdadi;




import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.management.timer.Timer;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ScoresGUI {

	static StringBuilder result;
	static String comp;
	static int matchday;
	static String cond="all";
	
	
	public static String GETrequest() throws IOException {
		
		 
	    URL urlForGetRequest = new URL("http://api.football-data.org/v2/competitions/"+comp+"/matches/?matchday="+matchday);
	    String readLine = null;
	    HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
	    conection.setRequestMethod("GET");
	    conection.setRequestProperty("X-Auth-Token", "ac6fd7a8c0d14619a8039a30e118da9c"); // set userId its a sample here
	    int responseCode = conection.getResponseCode();
	    if (responseCode == HttpURLConnection.HTTP_OK) {
	        BufferedReader in = new BufferedReader(
	            new InputStreamReader(conection.getInputStream()));
	        StringBuffer response = new StringBuffer();
	        while ((readLine = in .readLine()) != null) {
	            response.append(readLine);
	        } in .close();
	        // print result
	       return response.toString();
	        //GetAndPost.POSTRequest(response.toString());
	    } else {
	      return "didn't work";
	    }
	}
	
	public static StringBuilder getAllMatches(JSONTokener tokener) throws Exception {
		StringBuilder result=new StringBuilder();
		
		JSONObject mainObj = new JSONObject(tokener);
		JSONObject match,score,homeTeam,awayTeam,fullTime;
		JSONArray matches = mainObj.getJSONArray("matches");
		for(int i=0;i<matches.length();i++) {
		match = matches.getJSONObject(i);
		result.append("Match #"+(i+1)+"\n");
		result.append("UTC Date: "+match.getString("utcDate")+"\n");
		result.append("Result: \n");
		score = match.getJSONObject("score");
		fullTime = score.getJSONObject("fullTime");
		homeTeam = match.getJSONObject("homeTeam");
		String homeTeamName = homeTeam.getString("name");
		awayTeam = match.getJSONObject("awayTeam");
		String awayTeamName = awayTeam.getString("name");
		int homeTeamScore =0;
		try {
		homeTeamScore = fullTime.getInt("homeTeam");
		
		}
		catch(JSONException e1) {
			result.append("Match not played between " +homeTeamName+ " and "+ awayTeamName);
			continue;
		}
		
		int awayTeamScore = fullTime.getInt("awayTeam");
		
		
		result.append(homeTeamName+" "+homeTeamScore+ " - "+ awayTeamScore +" "+ awayTeamName+"\n");
		}
		
		
		return result;
	}
//	
//	public static StringBuilder getSpecificTeam(String team, JSONTokener tokener) {
//		StringBuilder result=new StringBuilder();
//		return result;
//	}
//	
	public static void setComp(String compt) {
		comp = compt;
		
	}
	
	public static void setMatchDay(String a) {
		matchday=Integer.parseInt(a);
		
	}
	public static StringBuilder getResult() throws Exception {
		JSONTokener tokener  = new JSONTokener(GETrequest());
		
			result=getAllMatches(tokener);
		
	return result;
	}
}
