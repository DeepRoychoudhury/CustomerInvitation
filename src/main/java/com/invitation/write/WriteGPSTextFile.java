package com.invitation.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.invitation.location.GPS_Location;

public class WriteGPSTextFile implements WriteFile {

	private String file;

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	@Override
	public File writeFile(List str) {
		List<GPS_Location> gpsLocation = new ArrayList<GPS_Location>();
		gpsLocation = str;
		String list = writeListToString(gpsLocation);
		File file = new File("output.txt");
		FileWriter fileToSave;
		try {
			fileToSave = new	FileWriter(file);
			fileToSave.write(list);
			fileToSave.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		return file;
	}

	private String writeListToString(List<GPS_Location> gpsLocation) {
		StringBuilder sb = new StringBuilder();
		for(GPS_Location gps : gpsLocation) {
			sb.append("{user_id:").append(gps.getUser_id()).append(",name:").append(gps.getName()).append("}");
		}
		return sb.toString();
	}
	
}
