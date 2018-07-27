package com.sanyang.pojo;

public class Project {
	
	
	 private Integer pid      ;//  NUMBER not null,
	 private Integer  dtid     ;//  NUMBER,
	 private String  proname  ;//  VARCHAR2(100),
	 private String proaddress;// VARCHAR2(100),
	 private String begindate;//  DATE,
	 private String enddate;//    DATE,
	 private String  principal;//  VARCHAR2(100),
	 private String ischeck ;//   VARCHAR2(100)
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getDtid() {
		return dtid;
	}
	public void setDtid(Integer dtid) {
		this.dtid = dtid;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public String getProaddress() {
		return proaddress;
	}
	public void setProaddress(String proaddress) {
		this.proaddress = proaddress;
	}
	public String getBegindate() {
		return begindate;
	}
	public void setBegindate(String begindate) {
		this.begindate = begindate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getIscheck() {
		return ischeck;
	}
	public void setIscheck(String ischeck) {
		this.ischeck = ischeck;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", dtid=" + dtid + ", proname=" + proname + ", proaddress=" + proaddress
				+ ", begindate=" + begindate + ", enddate=" + enddate + ", principal=" + principal + ", ischeck="
				+ ischeck + "]";
	}
	 
	 

}
