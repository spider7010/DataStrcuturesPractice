package com.santhosh.caching;

public class Department {

	private int deptId;
	private String dept;
	
	public Department(int deptId, String dept) {
		super();
		this.deptId = deptId;
		this.dept = dept;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dept=" + dept + "]";
	}
}
