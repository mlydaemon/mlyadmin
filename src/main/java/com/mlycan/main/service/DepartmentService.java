package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.Department;

public interface DepartmentService {
	   
		public List<Department>  findAll(Integer count,Integer curpage);

		public Integer findAllCount();
		
		public Department  findDepartment(Integer departmentId);
		
		public Integer saveDepartment(String  departmentName,Integer  parentId,String  link,Integer  priority,Integer  display);
		
		public Integer updateDepartment(Integer  departmentId,String  departmentName,Integer  parentId,String  link,Integer  priority,Integer  display);
		
		public Integer deleteDepartment(Integer departmentId);
		
}
