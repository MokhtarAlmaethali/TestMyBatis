package com.neuedu.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.neuedu.model.mapper.DepartmentMapper;
import com.neuedu.model.mapper.EmployeeMapper;
import com.neuedu.model.po.Department;
import com.neuedu.model.po.Employee;


public class TestEmployeeMapper {
	
//	if we want to output some message instead of console see logvack.xml
	Logger logger=LoggerFactory.getLogger(TestEmployeeMapper.class);
	
//	config the output message to file
	@Test
	public void test1(){
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			//get SqlSessionFactory 
			SqlSessionFactory sqlSessionFactory =
					  new SqlSessionFactoryBuilder().build(inputStream); 
			//get sqlSession
			
		 	SqlSession session= sqlSessionFactory.openSession();
			
		 	//validate the session(connected to database or not)
		 	System.out.println(session);
//		 	get mapper
		 	
		 	EmployeeMapper employeemapper= session.getMapper(EmployeeMapper.class);
		 	Employee e=employeemapper.getEmployeeById(3);
		 	System.out.println(e.getEmpno()+"\t"+e.getName()+"\t"+e.getSal()+"\t"+e.getHiredate()+"\t"+e.getDeptno());
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test2(){
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			//get SqlSessionFactory 
			SqlSessionFactory sqlSessionFactory =
					  new SqlSessionFactoryBuilder().build(inputStream); 
			//get sqlSession
			
		 	SqlSession session= sqlSessionFactory.openSession();
			
		 	//validate the session(connected to database or not)
		 	System.out.println(session);
//		 	get mapper
		 	
		 	EmployeeMapper employeemapper= session.getMapper(EmployeeMapper.class);
		 	List<Employee> list=employeemapper.getEmployeeByName("nicle");
		 	for(Employee e:list){
		 	System.out.println(e.getEmpno()+"\t"+e.getName()+"\t"+e.getSal()+"\t"+e.getHiredate()+"\t"+e.getDeptno());
		 	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test3(){
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			//get SqlSessionFactory 
			SqlSessionFactory sqlSessionFactory =
					  new SqlSessionFactoryBuilder().build(inputStream); 
			//get sqlSession
			
		 	SqlSession session= sqlSessionFactory.openSession();
			
		 	//validate the session(connected to database or not)
		 	System.out.println(session);
//		 	get mapper
		 	
		 	EmployeeMapper employeemapper= session.getMapper(EmployeeMapper.class);
		 	List<Employee> list=employeemapper.getEmployeeByCondition("nicle",Date.valueOf("2018-02-04"));
		 	for(Employee e:list){
		 	System.out.println(e.getEmpno()+"\t"+e.getName()+"\t"+e.getSal()+"\t"+e.getHiredate()+"\t"+e.getDeptno());
		 	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test4(){
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			//get SqlSessionFactory 
			SqlSessionFactory sqlSessionFactory =
					  new SqlSessionFactoryBuilder().build(inputStream); 
			//get sqlSession
			
		 	SqlSession session= sqlSessionFactory.openSession();
			
		 	//validate the session(connected to database or not)
		 	System.out.println(session);
//		 	get mapper
		 	
		 	EmployeeMapper employeemapper= session.getMapper(EmployeeMapper.class);
		 	
		 	Employee condition=new Employee();
		 	condition.setName("nicle");
		 	condition.setHiredate(Date.valueOf("2018-02-04"));
		 	List<Employee> list=employeemapper.getEmployeeByCondition2(condition);
		 	for(Employee e:list){
		 	System.out.println(e.getEmpno()+"\t"+e.getName()+"\t"+e.getSal()+"\t"+e.getHiredate()+"\t"+e.getDeptno());
		 	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	@Test
	public void test5(){
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			//get SqlSessionFactory 
			SqlSessionFactory sqlSessionFactory =
					  new SqlSessionFactoryBuilder().build(inputStream); 
			//get sqlSession
			
		 	SqlSession session= sqlSessionFactory.openSession();
			
		 	//validate the session(connected to database or not)
		 	System.out.println(session);
//		 	get mapper
		 	
		 	EmployeeMapper employeemapper= session.getMapper(EmployeeMapper.class);
		 	
		 	HashMap<String, Object> condition=new HashMap<>();
		 	condition.put("name", "nicle");
		 	condition.put("hiredate",Date.valueOf("2018-02-04"));
		 	List<Employee> list=employeemapper.getEmployeeByCondition3(condition);
		 	for(Employee e:list){
		 	System.out.println(e.getEmpno()+"\t"+e.getName()+"\t"+e.getSal()+"\t"+e.getHiredate()+"\t"+e.getDeptno());
		 	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	@Test
	public void test6(){
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			//get SqlSessionFactory 
			SqlSessionFactory sqlSessionFactory =
					  new SqlSessionFactoryBuilder().build(inputStream); 
			//get sqlSession
			
		 	SqlSession session= sqlSessionFactory.openSession();
			
		 	//validate the session(connected to database or not)
		 	System.out.println(session);
//		 	get mapper
		 	
		 	EmployeeMapper employeemapper= session.getMapper(EmployeeMapper.class);
		 	
		 	Employee emp=new Employee();
		 	emp.setName("Mohammed");
		 	emp.setSal(10000.00);
		 	emp.setHiredate(Date.valueOf("2022-06-19"));
		 	emp.setDeptno(6);
		 	employeemapper.addEmployee(emp);
		 	
		 	// for mybatis, for insert, update, delete , we must commit the changes
		 	session.commit();
		 	
		 	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void test7(){
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			//get SqlSessionFactory 
			SqlSessionFactory sqlSessionFactory =
					  new SqlSessionFactoryBuilder().build(inputStream); 
			//get sqlSession
			
		 	
			SqlSession session= sqlSessionFactory.openSession();
			
		 	//validate the session(connected to database or not)
		 	System.out.println(session);
//		 	get mapper
		 	
		 	EmployeeMapper employeemapper= session.getMapper(EmployeeMapper.class);
		 	
		 	employeemapper.deleteEmployee(28);
		 	
		 	// for mybatis, for insert, update, delete , we must commit the changes
		 	session.commit();
		 	
		 	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void test8(){
		logger.info("test8 start to run");
		InputStream inputstream;
		try {
			inputstream = Resources.getResourceAsStream("mybatis-config.xml");
			//get SqlSessionFactory 
			SqlSessionFactory sqlSessionFactory =
					  new SqlSessionFactoryBuilder().build(inputstream); 
			//get sqlSession
			
		 	
			SqlSession session= sqlSessionFactory.openSession();
			
		 	//validate the session(connected to database or not)
		 	System.out.println(session);
//		 	get mapper
		 	
		 	EmployeeMapper employeemapper= session.getMapper(EmployeeMapper.class);
		 	
		 	employeemapper.updateEmployee("Ali", 29);
		 // for mybatis, for insert, update, delete , we must commit the changes
		 	session.commit();
		 			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}
	
	
	

}
