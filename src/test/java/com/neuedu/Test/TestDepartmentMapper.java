package com.neuedu.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.neuedu.model.mapper.DepartmentMapper;
import com.neuedu.model.po.Department;

public class TestDepartmentMapper {

@Test
	public void test1(){
		InputStream inputStream;
		 try {
//			 1. get SqlSessionFactory
//			 2. get SqlSession
//			 3. get DepartmentMapper
//			 3. Invoke methods
			 inputStream= Resources.getResourceAsStream("Mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession session=sqlSessionFactory.openSession();
			
			System.out.println(session);
			DepartmentMapper departmentMapper= session.getMapper(DepartmentMapper.class);
			
			List<Department> list= departmentMapper.getAllDepartment();
			
			for(Department d:list){
				System.out.println(d.getDeptno()+"\t"+d.getDname()+"\t"+d.getDloc());
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
}
