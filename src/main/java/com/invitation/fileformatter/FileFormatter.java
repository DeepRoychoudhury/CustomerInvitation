package com.invitation.fileformatter;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public abstract class FileFormatter<T> {
	public abstract T fileFormat(MultipartFile file);
}
