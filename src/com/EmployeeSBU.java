package com;

import java.util.List;

public class EmployeeSBU {
	private int sbuId;
	private String sbuName;
	private String sbuHead;
	private List<Employee> empList;
	
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	public Employee printEmpDetails(int id) {
		for(Employee e:empList) {
			if(e.getEmployeeId()==id)
				return e;
			
		}
		return null;
		
	}

}

