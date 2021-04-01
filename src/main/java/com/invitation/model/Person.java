package com.invitation.model;

import com.invitation.enums.AddressType;

public class Person {

	private int user_id;
	private String name;
	private AddressType addressType;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressType getAddressType() {
		return addressType;
	}
	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}
	@Override
	public String toString() {
		return "Person [user_id=" + user_id + ", name=" + name + ", addressType=" + addressType + "]";
	}
	

}
