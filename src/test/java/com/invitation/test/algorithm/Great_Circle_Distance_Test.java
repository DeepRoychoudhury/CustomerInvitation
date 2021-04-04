package com.invitation.test.algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.invitation.algorithm.Great_Circle_Distance;
import com.invitation.model.GPS_Location;

public class Great_Circle_Distance_Test {

	@Autowired
	private Great_Circle_Distance great_circle_distance;
	
	@MockBean
	private GPS_Location gpsLocation ;
	
	@Test
	@DisplayName("Test should return double data type")
	public void findDistanceTest() {
		gpsLocation = new GPS_Location("52.986375","-6.043701","Christina McArdle",1);
		String userLatitude = gpsLocation.getLatitude();
		String userLongitude = gpsLocation.getLongitude();
		assertEquals(Double.TYPE, great_circle_distance.findDistance(userLatitude, userLongitude));
	}
}
