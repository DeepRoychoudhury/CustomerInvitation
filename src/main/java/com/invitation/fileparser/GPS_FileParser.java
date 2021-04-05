package com.invitation.fileparser;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.invitation.location.GPS_Location;

public class GPS_FileParser extends FileParser{

	private List<GPS_Location> gps_fileParser(String str){
		List<GPS_Location> listOfGPSLocation = new ArrayList<GPS_Location>();
		
		JSONObject json = new JSONObject(str);
		JSONArray customerArray = json.getJSONArray("customers");
		for(int i=0;i<customerArray.length();i++) {
			JSONObject jsonCustomer = customerArray.getJSONObject(i);
			GPS_Location gpsLocation = new GPS_Location(jsonCustomer.getString("latitude"),jsonCustomer.getString("longitude"),jsonCustomer.getString("name"),jsonCustomer.getInt("user_id"));
			listOfGPSLocation.add(gpsLocation);
		}
		return listOfGPSLocation;
	}
	
	@Override
	public List<GPS_Location> fileParser(String str) {
		List<GPS_Location> listOfGPSLocation = new ArrayList<GPS_Location>();
		listOfGPSLocation = gps_fileParser(str);
		return listOfGPSLocation;
	}

	
}
