package com.sanyang.handler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanyang.dao.DeveloperCompanyDao;
import com.sanyang.pojo.DeveloperCompany;
import com.sanyang.pojo.Project;

@Controller
public class DeveloperCompanyHandler {

	
	@Autowired
	private DeveloperCompanyDao Dao;
	
	@RequestMapping("/getAllDeveloperCompany")
	public String getAllDeveloperCompany(Map<String, Object> map) {

		List<DeveloperCompany> allDeveloperCompany = Dao.getAllDeveloperCompany();
		map.put("allDeveloperCompany", allDeveloperCompany);

		return "list";
	}
	
	
	@RequestMapping("/addCompany")
	public String addDeveloperCompany(DeveloperCompany developerCompany,Project project) {
		System.out.println(developerCompany.getCompanyname());
		System.out.println(developerCompany.getCompanyaddress());
		System.out.println(developerCompany.getCompanytel());
		System.out.println(developerCompany.getCorporation());
		Dao.addDeveloperCompany(developerCompany);
        System.out.println(developerCompany.getDid());
		project.setDtid(developerCompany.getDid());
        Dao.addProject(project);
		return "redirect:getAllDeveloperCompany.gyc";
	}
}
