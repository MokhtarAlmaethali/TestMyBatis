package com.neuedu.model.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neuedu.model.po.Employee;

public interface EmployeeMapper {
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(int empno);
	
	public List<Employee> getEmployeeByName(String name);
	public List<Employee> getEmployeeByCondition(@Param("ename") String name,@Param("hireda") Date hiredate);
	public List<Employee> getEmployeeByCondition2(Employee condition);
}
