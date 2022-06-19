package com.neuedu.model.po;

import java.sql.Date;

public class Employee {
	
	private int empno;
	private String name;
	private double sal;
	private Date hiredate;
//	deptno is useless because we have instance of department
//	private int deptno;
	
	private Department dept=new Department();

	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int getDeptno() {
		return dept.getDeptno();
	}
	public void setDeptno(int deptno) {
		this.dept.setDeptno(deptno);
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
	
}
