package com.invitation.test.parser;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.invitation.fileparser.FileParser;
import com.invitation.fileparser.GPS_FileParser;
import com.invitation.location.GPS_Location;

public class GPS_File_Parser_Test {

	private String latitude = "52.986375";
	private String longitude = "-6.043701";
	private String name = "Deep Roychoudhury";
	private int user_id = 2;
	
	private FileParser gpsFileParser = new GPS_FileParser();
	private GPS_Location gpsLocation = new GPS_Location(latitude,longitude,name,user_id);
	
	private String str = "{\"customers\":[{\r\n"
			+ "   \"latitude\":\"52.986375\",\r\n"
			+ "   \"user_id\":12,\r\n"
			+ "   \"name\":\"Christina McArdle\",\r\n"
			+ "   \"longitude\":\"-6.043701\"\r\n"
			+ "},{\r\n"
			+ "   \"latitude\":\"51.92893\",\r\n"
			+ "   \"user_id\":1,\r\n"
			+ "   \"name\":\"Alice Cahill\",\r\n"
			+ "   \"longitude\":\"-10.27699\"\r\n"
			+ "}]}";
	
	@Test
	@DisplayName("Test should return true if list of GPS_Location is found")
	public void FileParserTest() {
		List<GPS_Location> gpsLocations = gpsFileParser.fileParser(str);
		assertTrue(gpsLocations.getClass().equals(new ArrayList<GPS_Location>().getClass()));
	}
}
