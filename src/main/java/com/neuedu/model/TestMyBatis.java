package com.neuedu.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.neuedu.model.mapper.EmployeeMapper;
import com.neuedu.model.po.Employee;

public class TestMyBatis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first get sqlSessionFactory which can produce sqlSession
		// almost equal to database connection
		
		//load mybatis-config.xml as InputStream
		
		try {
			//this method find target file in classpath 
			InputStream inputStream= Resources.getResourceAsStream("mybatis-config.xml");
			//get SqlSessionFactory 
			SqlSessionFactory sqlSessionFactory =
					  new SqlSessionFactoryBuilder().build(inputStream); 
			//get sqlSession
			
		 	SqlSession session= sqlSessionFactory.openSession();
			
		 	//validate the session(connected to database or not)
		 	System.out.println(session);
		 	
		 	//get mapper
		 	EmployeeMapper employeeMapper= session.getMapper(EmployeeMapper.class);
		 	
		 	List<Employee> list= employeeMapper.getAllEmployees();
		 	
		 	
		 	for(Employee e:list){
		 		System.out.println(e.getEmpno()+"\t"+e.getName()+"\t"+e.getSal()+"\t"+e.getHiredate()+"\t"+e.getDeptno());
		 	}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
