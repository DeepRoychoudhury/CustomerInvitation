package com.invitation.test.sort;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.invitation.location.GPS_Location;
import com.invitation.sort.AscendingUserIdSort;

public class AscendingUserIdSort_Test {
	private String latitude = "52.986375";
	private String longitude = "-6.043701";
	private String name = "Deep Roychoudhury";
	
	@MockBean
	private AscendingUserIdSort ascUserIdSort;
	private GPS_Location gpsLocation;	

	@Test
	@DisplayName("Test should return true if user ids are sorted")
	public void UserSorting_Test_Complete() {
		boolean result = true;
		List<GPS_Location> lst = new ArrayList<GPS_Location>();
		for(int i=10;i>0;i--)
		{
		GPS_Location obj = new GPS_Location(latitude, longitude, name,i);
		lst.add(obj);
		}
		ascUserIdSort = new AscendingUserIdSort();
		List<Object> lstSorted = ascUserIdSort.sortUsers(lst);
		int prevUser_id = 0;
		for(Object gps : lstSorted) {
			GPS_Location gpsLoc = (GPS_Location) gps;
			if(prevUser_id !=0) {
				if(prevUser_id > gpsLoc.getUser_id()) result = false;
			}
			prevUser_id = gpsLoc.getUser_id();
		}
		assertTrue(result == true);
	}
}
