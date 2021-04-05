package com.invitation.write;

import java.io.File;
import java.util.List;

public interface WriteFile<T> {
	public File writeFile(List<T> str);
}
