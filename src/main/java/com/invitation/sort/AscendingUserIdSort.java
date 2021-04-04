package com.invitation.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.invitation.model.GPS_Location;

public class AscendingUserIdSort implements Sorting {	
	
	private List<GPS_Location> sortingUsers(List<GPS_Location> customerDetails) {
		List<GPS_Location> gps = (List<GPS_Location>) customerDetails;
		Collections.sort(gps, new Comparator<GPS_Location>() {
		    @Override
		    /* Order two 'User' objects based on their names. */
		    public int compare(GPS_Location left,GPS_Location right) {
		        return (Integer.valueOf(left.getUser_id())).compareTo(Integer.valueOf(right.getUser_id()));
		    }
		});
		return gps;
	}

	@Override
	public List sortUsers(List customerDetails) {
		List<GPS_Location> gps = sortingUsers((List<GPS_Location>) customerDetails);
		return gps;
	}	
	
}
