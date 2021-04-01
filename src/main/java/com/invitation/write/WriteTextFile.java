package com.invitation.write;

import com.invitation.enums.FileFormat;
import com.invitation.enums.FileType;

public class WriteTextFile implements WriteFile {

	private FileType fileType;
	private FileFormat fileFormat;
	private String file;
	
	
	public WriteTextFile(FileType fileType, FileFormat fileFormat, String file) {
		super();
		this.fileType = fileType;
		this.fileFormat = fileFormat;
		this.file = file;
	}


	public FileType getFileType() {
		return fileType;
	}


	public void setFileType(FileType fileType) {
		this.fileType = fileType;
	}


	public FileFormat getFileFormat() {
		return fileFormat;
	}


	public void setFileFormat(FileFormat fileFormat) {
		this.fileFormat = fileFormat;
	}


	public String getFile() {
		return file;
	}


	public void setFile(String file) {
		this.file = file;
	}


	@Override
	public String writeFile(FileType fileType, FileFormat fileFormat,String file) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toString() {
		return "WriteTextFile [fileType=" + fileType + ", fileFormat=" + fileFormat + ", file=" + file + "]";
	}
	
	

}
