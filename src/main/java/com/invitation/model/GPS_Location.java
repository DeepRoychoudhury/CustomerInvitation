package com.invitation.model;

import com.invitation.enums.AddressType;

public class GPS_Location implements Address {

	private double latitude;
	private double longitude;
	private AddressType addressType;
	

	public GPS_Location(double latitude, double longitude, AddressType addressType) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.addressType = addressType;
	}


	public AddressType getAddressType() {
		return addressType;
	}


	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}


	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	@Override
	public AddressType fetchAddressType(AddressType addressType) {
		// TODO Auto-generated method stub
		return AddressType.GPS_Location;
	}


	@Override
	public String toString() {
		return "GPS_Location [latitude=" + latitude + ", longitude=" + longitude + ", addressType=" + addressType + "]";
	}


}
