package com.cg.service;

import com.cg.entity.College;
import com.cg.repository.ICollegeRepository;
import com.cg.repository.ICollegeRepositoryImpl;

public class ICollegeServiceImp implements ICollegeService{
	private ICollegeRepository co;

	public ICollegeServiceImp() {
		super();
		co=new ICollegeRepositoryImpl();
	}

	@Override
	public College addCollege(College college) {
		co.beginTransaction();
		co.addCollege(college);
		co.commitTransaction();
		return college;
	}

	@Override
	public College updateCollege(College college) {
		co.beginTransaction();
		co.updateCollege(college);
		co.commitTransaction();
		return college;
	}

	@Override
	public College searchCollege(long id) {
		co.beginTransaction();
		College college=co.searchCollege(id);
		co.commitTransaction();
		return college;
	}

	@Override
	public boolean deleteCollege(long id) {
		co.deleteCollege(id);
		return true;
	}

}
