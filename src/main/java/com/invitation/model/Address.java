package com.invitation.model;

import com.invitation.enums.AddressType;

public interface Address {

	public AddressType fetchAddress(AddressType addressType);
}
