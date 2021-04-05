package com.invitation.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.invitation.algorithm.Distance;
import com.invitation.fileformatter.FileFormatter;
import com.invitation.fileparser.FileParser;
import com.invitation.sort.Sorting;
import com.invitation.write.WriteFile;

public abstract class InvitationService<T> {
	
	@Autowired
	private FileFormatter<T> fileFormatter;
	
	@Autowired
	private FileParser<T> fileParser;
	
	@Autowired
	private Distance distance;
	
	@Autowired
	private Sorting sorting;
	
	@Autowired
	private WriteFile writeFile;

	public abstract double findDistance();
		
	public File fetchUsersEligible(MultipartFile file) {
		String str = (String)fileFormatter.fileFormat(file);
		List<T> listOfLocationParameters = fileParser.fileParser(str);
		List<T> customersDetails = new ArrayList<T>();
		for(T list : listOfLocationParameters) {
			T eligibleUser = (T)distance.findDistance(list);
			if(eligibleUser != null) customersDetails.add(eligibleUser);
		}
		sorting.sortUsers(customersDetails);		
		return writeFile.writeFile(customersDetails);
	}
}
