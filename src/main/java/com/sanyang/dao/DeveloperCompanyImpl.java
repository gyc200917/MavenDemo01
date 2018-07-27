package com.sanyang.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.mapper.DeveloperCompanymapper;
import com.sanyang.pojo.DeveloperCompany;
import com.sanyang.pojo.Project;

@Repository("Dao")
public class DeveloperCompanyImpl implements DeveloperCompanyDao {
    
	@Autowired
	private DeveloperCompanymapper developerCompanymapper;
	
	@Override
	public List<DeveloperCompany> getAllDeveloperCompany() {
		// TODO Auto-generated method stub
		List<DeveloperCompany> allDeveloperCompany = developerCompanymapper.getAllDeveloperCompany();
		return allDeveloperCompany;
	}

	@Override
	public void addDeveloperCompany(DeveloperCompany developerCompany) {
		// TODO Auto-generated method stub
		developerCompanymapper.addDeveloperCompany(developerCompany);
	}

	@Override
	public void addProject(Project project) {
		// TODO Auto-generated method stub
		developerCompanymapper.addProject(project);
	}

}
