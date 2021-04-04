package com.invitation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.invitation.algorithm.Distance;
import com.invitation.fileformatter.FileFormatter;
import com.invitation.fileparser.FileParser;
import com.invitation.sort.Sorting;

public abstract class InvitationService<T> {
	
	@Autowired
	private FileFormatter<T> fileFormatter;
	
	@Autowired
	private FileParser<T> fileParser;
	
	@Autowired
	private Distance distance;
	
	@Autowired
	private Sorting sorting;

	public abstract double findDistance();
		
	public String fetchUsersEligible(MultipartFile file) {
		String str = (String)fileFormatter.fileFormat(file);
		List<T> listOfLocationParameters = fileParser.fileParser(str);
		List<T> customersDetails = new ArrayList<T>();
		for(T list : listOfLocationParameters) {
			T eligibleUser = (T)distance.findDistance(list);
			if(eligibleUser != null) customersDetails.add(eligibleUser);
		}
		sorting.sortUsers(customersDetails);
		return "";
	}
}
