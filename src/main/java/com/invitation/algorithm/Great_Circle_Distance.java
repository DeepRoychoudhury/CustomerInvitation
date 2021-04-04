package com.invitation.algorithm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.invitation.model.GPS_Location;

@Component
public class Great_Circle_Distance implements Distance {
	
	private final String defaultLatitude;	
	private final String defaultLongitude;	
	private final double preferredDistance;
	
	public Great_Circle_Distance(@Value("${office.latitude}") String defaultLatitude,@Value("${office.longitude}") String defaultLongitude,@Value("${preferredDistance}") double preferredDistance) {
		this.defaultLatitude = defaultLatitude;
		this.defaultLongitude = defaultLongitude;
		this.preferredDistance = preferredDistance;
	}
	
	public double findDistance(String userLatitude, String userLongitude) {
		double latitude1 = Math.toRadians(Double.parseDouble(defaultLatitude));
        double longitude1 = Math.toRadians(Double.parseDouble(defaultLongitude));
        double latitude2 = Math.toRadians(Double.parseDouble(userLatitude));
        double longitude2 = Math.toRadians(Double.parseDouble(userLongitude));

        // great circle distance in radians
        double angle = Math.acos(Math.sin(latitude1) * Math.sin(latitude2)
                      + Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2));

        // convert back to degrees
        angle = Math.toDegrees(angle);

        // each degree on a great circle of Earth is 111.32 km
        double distance1 = 111.32 * angle;
		return distance1;
	}
	
	public boolean isCustomerEligible(double distance) {
		if(distance <= preferredDistance) return true;
		
		return false;
	}

	public GPS_Location findDistance(GPS_Location list) {
		if(isCustomerEligible(findDistance(list.getLatitude(),list.getLongitude()))) {
			return list;
		}
		return null;
	}

	@Override
	public Object findDistance(Object list) {
		GPS_Location gpsLocation = (GPS_Location) list;
		return findDistance(gpsLocation);
	}

}
