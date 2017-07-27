package com.tacademy.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.tacademy.parser.MelonParser;
import com.tacademy.vo.Melon;

public class MelonTest {

	public MelonTest() {
		// TODO Auto-generated constructor stub
		
		String melonURL = "http://apis.skplanetx.com/melon/charts/realtime?count=10&page=1&version=1";
		
		URL url = null;
		HttpURLConnection conn = null;
		BufferedReader reader = null;
		try{
			url = new URL(melonURL);
			
			conn = (HttpURLConnection)url.openConnection();
			conn.setRequestProperty("appKey", "31c1e579-b9c2-3697-95d3-ed1ba8a82815");
			conn.setRequestProperty("format", "json");
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String readData = "";
			StringBuilder builder = new StringBuilder();
			while((readData = reader.readLine()) != null){
				builder.append(readData).append("\n");
			}
			String jsonStr = builder.toString();
			MelonParser paser = new MelonParser();
//			System.out.println(jsonStr);
			
			Melon melon = paser.doMelonParser(jsonStr);
			System.out.println(melon);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MelonTest();
	}

}
