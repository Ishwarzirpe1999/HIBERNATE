package com.cg.repository;

import com.cg.entity.College;

public interface ICollegeRepository {
	     College addCollege(College college) ;
		 College updateCollege(College college) ;
		 College searchCollege(long id); 
		 boolean deleteCollege(long id);
		 
		 public void beginTransaction(); 
		 public void commitTransaction();
}
