package com.cg.service;

import com.cg.entity.College;

public interface ICollegeService {
	 College addCollege(College college);
	 College updateCollege(College college) ;
	 College searchCollege(long id);
	 boolean deleteCollege(long id);
	// boolean schedulePlacement(Placement placement);
	 
	
}
