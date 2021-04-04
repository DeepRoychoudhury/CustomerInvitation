package com.invitation.fileparser;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

public abstract class FileParser<T> {
	public abstract List<T> fileParser(String str);

}
