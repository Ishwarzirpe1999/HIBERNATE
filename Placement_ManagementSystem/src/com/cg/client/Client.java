package com.cg.client;

import com.cg.entity.College;
import com.cg.service.ICollegeService;
import com.cg.service.ICollegeServiceImp;

public class Client {

	public static void main(String[] args) {
		College c = new College();
		ICollegeService se = new ICollegeServiceImp();
		c.setId(101);
		c.setCollegeName("JSCOE");
		c.setLocation("Hadapsar");
		se.addCollege(c);
	    System.out.println("Record is added");
	    
		
	}
	

}
