package com.invitation.model;

import java.io.File;

import com.invitation.enums.FileFormat;
import com.invitation.enums.FileType;

public interface ReadFile {	
	public String readFile(FileType fileType, FileFormat fileFormat,File file);
}
