package com.invitation.test.location;

import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.invitation.location.GPS_Location;

public class GPS_Location_Test {
	
	private String latitude = "52.986375";
	private String longitude = "-6.043701";
	private String name = "Deep Roychoudhury";
	private int user_id = 2;
	
	private String nolatitude = "";
	private String nolongitude = "";
	private String noname = "";

	@MockBean
	private GPS_Location gpsLocation;	
	
	@Test
	@DisplayName("Test should return true if GPS_Location data is complete")
	public void GPS_Location_Test_Complete() {
		gpsLocation = new GPS_Location(latitude, longitude, name, user_id);
		assertTrue(!gpsLocation.getLatitude().isEmpty() && 
				!gpsLocation.getLongitude().isEmpty() &&
				!gpsLocation.getName().isEmpty() &&
				!String.valueOf(gpsLocation.getUser_id()).isEmpty() &&
				gpsLocation.getUser_id() == (int)gpsLocation.getUser_id());
	}	
	
	@Test
	@DisplayName("Test should return false if GPS_Location data is not proper")
	public void GPS_Location_Test_NotProper() {
		gpsLocation = new GPS_Location(nolatitude, nolongitude, noname, user_id);
		assertTrue(!gpsLocation.getLatitude().isEmpty() || 
				!gpsLocation.getLongitude().isEmpty() ||
				!gpsLocation.getName().isEmpty() || 
				!String.valueOf(gpsLocation.getUser_id()).isEmpty());
	}
}
