package com.sanyang.dao;

import java.util.List;

import com.sanyang.pojo.DeveloperCompany;
import com.sanyang.pojo.Project;

public interface DeveloperCompanyDao {
	public List<DeveloperCompany> getAllDeveloperCompany();
	
	public void addDeveloperCompany(DeveloperCompany developerCompany);
	
	public void addProject(Project project);
}
