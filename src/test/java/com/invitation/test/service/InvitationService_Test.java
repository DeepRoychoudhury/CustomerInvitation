package com.invitation.test.service;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;
import org.springframework.mock.web.MockMultipartFile;

import com.invitation.fileformatter.FileFormatter;
import com.invitation.fileformatter.GPS_File_Formatter;
import com.invitation.service.GPSInvitationService;
import com.invitation.service.InvitationService;

public class InvitationService_Test {

	private InvitationService invitationService = new GPSInvitationService();
	
	@Mock
	private static final FileFormatter fileFormatter = mock(GPS_File_Formatter.class);
	
	//GPS_File_Formatter g = new GPS_File_Formatter();
	
	MockMultipartFile file = new MockMultipartFile("{\r\n"
			+ "   \"latitude\":\"52.986375\",\r\n"
			+ "   \"user_id\":12,\r\n"
			+ "   \"name\":\"Christina McArdle\",\r\n"
			+ "   \"longitude\":\"-6.043701\"\r\n"
			+ "}", "customers.txt", "text/plain", "jsonString".getBytes());
	
	
	@Test
	@DisplayName("Perform functional test to check if it returns a file")
	public void InvitationService_Test() {
		MockMultipartFile file1 = new MockMultipartFile("{\"customers\":[{"
				+ "\"latitude\":\"52.986375\","
				+ "\"user_id\":12,"
				+ "\"name\":\"Christina McArdle\","
				+ "\"longitude\":\"-6.043701\"}]}", "customers.txt", "text/plain", "jsonString".getBytes());
		
		File result = invitationService.fetchUsersEligible(file1);
		assertTrue(result.isFile());
		
		
		
		/*when(fileFormatter.fileFormat(file)).thenReturn("{\"customers\":[{"
				+ "\"latitude\":\"52.986375\","
				+ "\"user_id\":12,"
				+ "\"name\":\"Christina McArdle\","
				+ "\"longitude\":\"-6.043701\"}]}");
		assertTrue(invitationService.fetchUsersEligible(file).getClass().equals(File.class));
	*/}
}
