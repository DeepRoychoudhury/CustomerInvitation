package com.invitation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.invitation.fileformatter.FileFormatter;
import com.invitation.fileformatter.GPS_File_Formatter;
import com.invitation.fileparser.FileParser;
import com.invitation.fileparser.GPS_FileParser;
import com.invitation.model.FileStorageProperties;
import com.invitation.service.GPSInvitationService;
import com.invitation.service.InvitationService;
import com.invitation.sort.AscendingUserIdSort;
import com.invitation.sort.Sorting;

@SpringBootApplication
@ComponentScan
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class CustomerInvitationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerInvitationApplication.class, args);
	}
	
	@Bean
	public InvitationService getInvitationService() {
		return new GPSInvitationService();
	}
	
	@Bean
	public FileFormatter getFileFormatter() {
		return new GPS_File_Formatter();
	}

	@Bean
	public FileParser getFileParser() {
		return new GPS_FileParser();
	}
	
	@Bean
	public Sorting getSortingType() {
		return new AscendingUserIdSort();
	}
}
