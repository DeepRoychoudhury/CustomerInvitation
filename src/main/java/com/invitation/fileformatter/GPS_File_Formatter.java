package com.invitation.fileformatter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

public class GPS_File_Formatter extends FileFormatter{

	@Value("${gpsFilePrefix}")
	private String PREFIX;
	
	@Value("${gpsFilePostfix}")
	private String POSTFIX;
	
	private String fileFormatter(MultipartFile file) throws Exception{	
		StringBuilder sb = new StringBuilder();
		try {
			String str = new String(file.getBytes());
			if(!str.contains("[")) {
			sb.append(PREFIX).append(str).append(POSTFIX);	
			}
			else if(str.contains("{\"customers\":[") && str.contains("]}")) {
				sb = sb.append(str);
			}
			else {
				System.out.println("Cannot format this file");
				throw new Exception();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}

	@Override
	public String fileFormat(MultipartFile file) {
		String result = null;
		try {
			result = fileFormatter(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
