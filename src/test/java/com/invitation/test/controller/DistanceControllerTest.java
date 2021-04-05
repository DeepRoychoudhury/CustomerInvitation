package com.invitation.test.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.mock.web.MockMultipartFile;

public class DistanceControllerTest {

	MockMultipartFile file = new MockMultipartFile("data", "customers.txt", "text/plain", "jsonString".getBytes());
	MockMultipartFile file2 = new MockMultipartFile("data", "other-file-name.data", "application/json", "jsonString".getBytes());
	
	@Test
	@DisplayName("Test should return true if File is of type text")
	public void uploadFileTest() {
		assertTrue(file.getContentType()=="text/plain");
	}
	
	@Test
	@DisplayName("Test should return false if File is not of type text")
	public void uploadFileTest_1() {
		assertTrue(file2.getContentType()!="text/plain");
	}
}
