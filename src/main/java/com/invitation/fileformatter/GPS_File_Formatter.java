package com.invitation.fileformatter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

public class GPS_File_Formatter extends FileFormatter{

	@Value("${gpsFilePrefix}")
	private String PREFIX;
	
	@Value("${gpsFilePostfix}")
	private String POSTFIX;
	
	private String fileFormatter(MultipartFile file){	
		StringBuilder sb = new StringBuilder();
		try {
			String str = new String(file.getBytes());
			sb.append(PREFIX).append(str).append(POSTFIX);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}

	@Override
	public String fileFormat(MultipartFile file) {
		String result = fileFormatter(file);
		return result;
	}
}
