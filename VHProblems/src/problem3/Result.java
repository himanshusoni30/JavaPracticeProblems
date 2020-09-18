package codetest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Stack;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Result {
	static JSONParser parser = null;
	static double count = 0;

	public static String getRequest(int userId, int page) {
		String url;
		if (page > 0) {
			url = "https://jsonmock.hackerrank.com/api/transactions/search?userId=" + userId + "&page=" + page;
		} else {
			url = "https://jsonmock.hackerrank.com/api/transactions/search?userId=" + userId;
		}
		StringBuilder resp = null;

		HttpURLConnection http;
		try {
			http = (HttpURLConnection) new URL(url).openConnection();
			http.setRequestMethod("GET");
			BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()));

			resp = new StringBuilder();
			String line;

			while ((line = in.readLine()) != null) {
				resp.append(line);
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return resp.toString();
	}

	public static void main(String[] args) {
		Stack<String> stk = pageData(4);
		int output = processPageData(stk,4,6,100,250);
		System.out.println(output);
	}	

	public static int getTransactions(int userId, int locationId, int netStart, int netEnd) {
		int output = 0;
		Stack<String> stk = pageData(userId);
		output = processPageData(stk, userId, locationId, netStart, netEnd);
		return output;
	}

	public static Stack<String> pageData(int userId) {
		Stack<String> dataPerPage = new Stack<String>();
		String json;
		int pages;
		try {
			json = Result.getRequest(userId, 0);
			parser = new JSONParser();
			pages = ((Long) ((JSONObject) parser.parse(json)).get("total_pages")).intValue();
			System.out.println("number of pages:" + pages);
			for (int i = pages; i > 0; i--) {
				dataPerPage.push(Result.getRequest(userId, i));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		return dataPerPage;
	}

	public static int processPageData(Stack<String> s, int userId, int locationId, int netStart, int netEnd) {
		Iterator<String> ite = s.iterator();
		while (ite.hasNext()) {
			parser = new JSONParser();
//			JSONObject obj;
			try {
				JSONObject obj = (JSONObject) parser.parse(ite.next());
				JSONArray dataArr = (JSONArray) obj.get("data");
				for (int j = 0; j < dataArr.size(); j++) {
					JSONObject eachDataSet = (JSONObject) dataArr.get(j);
					System.out.println("Each Data Set:" + eachDataSet);
					int locId = ((Long) ((JSONObject) eachDataSet.get("location")).get("id")).intValue();
//					System.out.println("Location Id in JSON: "+locId);
					int uId = ((Long) eachDataSet.get("userId")).intValue();
//					System.out.println("User Id in JSON: "+uId);
					int ip = ipFirstFragment((String) eachDataSet.get("ip"));
//					System.out.println("IP: "+ip);
					if (uId == userId && locId == locationId && (ip >= netStart && ip <= netEnd)) {
						double amount = amount((String) eachDataSet.get("amount"));
						count = count + amount;
					}
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}
		return (int) Math.round(count);
	}

	public static int ipFirstFragment(String ip) {
//		System.out.println("IP passed: "+ip);
		String[] strArr = ip.split("\\.");
		return Integer.parseInt(strArr[0]);
	}

	public static double amount(String amt) {
		return Double.parseDouble(amt.replaceAll("[$,]", ""));
	}
}