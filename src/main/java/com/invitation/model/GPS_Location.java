package com.invitation.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.invitation.enums.AddressType;

public class GPS_Location implements Address {

	@JsonProperty("latitude")
	private String latitude;
	@JsonProperty("longitude")
	private String longitude;
	@JsonProperty("name")
	private String name;
	@JsonProperty("user_id")
	private int user_id;
	 


	public GPS_Location(String latitude, String longitude, String name, int user_id) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.name = name;
		this.user_id = user_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	@Override
	public AddressType fetchAddress(AddressType addressType) {
		// TODO Auto-generated method stub
		return AddressType.GPS_Location;
	}



}
