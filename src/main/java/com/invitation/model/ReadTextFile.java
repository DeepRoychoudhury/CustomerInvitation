package com.invitation.model;

import java.io.File;

import com.invitation.enums.FileFormat;
import com.invitation.enums.FileType;

public class ReadTextFile implements ReadFile {

	private FileType fileType;
	private FileFormat fileFormat;
	private File file;
	
	
	public ReadTextFile(FileType fileType, FileFormat fileFormat, File file) {
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


	public File getFile() {
		return file;
	}


	public void setFile(File file) {
		this.file = file;
	}


	@Override
	public String readFile(FileType fileType, FileFormat fileFormat, File file) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toString() {
		return "ReadTextFile [fileType=" + fileType + ", fileFormat=" + fileFormat + ", file=" + file + "]";
	}
	
	

}
