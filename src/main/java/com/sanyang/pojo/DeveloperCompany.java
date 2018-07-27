package com.sanyang.pojo;

import java.util.List;

public class DeveloperCompany {
	
	 private Integer did            ;//NUMBER not null,
	 private String companyname   ;// VARCHAR2(100),
	 private String companyaddress ;//VARCHAR2(100),
	 private String corporation    ;//VARCHAR2(100),
	 private String  companytel     ;//VARCHAR2(100),
	 private String  createddate   ;// DATE
	 
	private List<Project> projects;
	 
	 
	 
	 
	 
	 
	
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCompanyaddress() {
		return companyaddress;
	}
	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}
	public String getCorporation() {
		return corporation;
	}
	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}
	public String getCompanytel() {
		return companytel;
	}
	public void setCompanytel(String companytel) {
		this.companytel = companytel;
	}
	public String getCreateddate() {
		return createddate;
	}
	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}
	@Override
	public String toString() {
		return "DeveloperCompany [did=" + did + ", companyname=" + companyname + ", companyaddress=" + companyaddress
				+ ", corporation=" + corporation + ", companytel=" + companytel + ", createddate=" + createddate
				+ ", projects=" + projects + "]";
	}


	 
	 
	

}
