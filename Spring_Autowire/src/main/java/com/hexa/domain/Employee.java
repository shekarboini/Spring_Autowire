package com.hexa.domain;

public class Employee {
	
	private int eid;
	private String empName;
	
	private Address add;
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setadd(Address add) {
		this.add = add;
	}
	
	public Employee() {
		System.out.println("Employee:0-param constructor");
	}
	
	public Employee(Address add) {
		super();
		this.add = add;
	}
	@Override
	public String toString() {
		return "eid---"+eid+"   empName---"+empName+"   add---"+add.toString();
	}

}
