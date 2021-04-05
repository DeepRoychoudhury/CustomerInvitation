package com.invitation.test.write;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;

import com.invitation.location.GPS_Location;
import com.invitation.write.WriteFile;
import com.invitation.write.WriteGPSTextFile;

public class WriteGPSTextFile_Test {

	private String latitude = "52.986375";
	private String longitude = "-6.043701";
	private String name = "Deep Roychoudhury";
	private int user_id = 2;
	
	private GPS_Location gpsLocation;
	
	private GPS_Location gpsLocation1;
	
	@Autowired
	private WriteFile write;
	
	@Test
	@DisplayName("Test returns true if the file is written")
	public void GPS_Text_File() {
		write = new WriteGPSTextFile();
		gpsLocation = new GPS_Location(latitude, longitude, name, user_id);
		gpsLocation1 = new GPS_Location(latitude, longitude, name, user_id);
		List<GPS_Location> gps = new ArrayList<GPS_Location>();
		gps.add(gpsLocation);
		gps.add(gpsLocation1);
		File file = write.writeFile(gps);
		assertTrue(!file.equals(null));
	}
}
