package com.neuedu.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.neuedu.model.mapper.EmployeeMapper;
import com.neuedu.model.po.Employee;

public class TestMyBatis {
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
	

}
