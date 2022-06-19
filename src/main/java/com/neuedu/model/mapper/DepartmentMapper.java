package com.neuedu.model.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neuedu.model.po.Department;
import com.neuedu.model.po.Employee;

public interface DepartmentMapper {

	public List<Department> getAllDepartment();
//	to select from two tables we can use 
//	1. HashMap
//	2. Define the relation between tables inside Java Class
	public List<HashMap<String,Object>> getEmployees();
	
	public List<Employee> getEmployees2();
}
