package com.invitation.test.algorithm;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.invitation.algorithm.Great_Circle_Distance;
import com.invitation.location.GPS_Location;

public class Great_Circle_Distance_Test {

	@Autowired
	private Great_Circle_Distance great_circle_distance = new Great_Circle_Distance("53.339428","-6.257664",100);
	
	@MockBean
	private GPS_Location gpsLocation ;
	
	@Test
	@DisplayName("Test should return GPS_Location type")
	public void findDistanceTest() {
		gpsLocation = new GPS_Location("52.986375","-6.043701","Christina McArdle",1);
		assertTrue(great_circle_distance.findDistance(gpsLocation).getClass().equals(gpsLocation.getClass()));
	}
}
