package com.invitation.test.format;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.mock.web.MockMultipartFile;

import com.invitation.fileformatter.FileFormatter;
import com.invitation.fileformatter.GPS_File_Formatter;

public class FileFormatter_Test {

	private FileFormatter fileFormatter = new GPS_File_Formatter();
	
	private String str = "{\"customers\":[{"
			+ "\"latitude\":\"52.986375\","
			+ "\"user_id\":12,"
			+ "\"name\":\"Christina McArdle\","
			+ "\"longitude\":\"-6.043701\"},"
			+"{\"latitude\":\"51.92893\","
			+"\"user_id\":1,"
			+"\"name\":\"Alice Cahill\","
			+ "\"longitude\":\"-10.27699\"}]}";
			
	MockMultipartFile file = new MockMultipartFile(str, "customers.txt", "text/plain", str.getBytes());
	
	@Test
	@DisplayName("Test return true if the file can be formatted if it has {customers:[ or not in string")
	public void FileFormatTest() {
		assertTrue(fileFormatter.fileFormat(file).getClass().equals(String.class));
	}
}
