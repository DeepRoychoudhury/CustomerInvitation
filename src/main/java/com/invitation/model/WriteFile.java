package com.invitation.model;

import com.invitation.enums.FileFormat;
import com.invitation.enums.FileType;

public interface WriteFile {
	public String writeFile(FileType fileType, FileFormat fileFormat, String file);
}
