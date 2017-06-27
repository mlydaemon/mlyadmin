package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Department;

public interface DepartmentMapper {

	public List<Department>  findAll(@Param("count")Integer count,@Param("curpage")Integer curpage);

	public Integer findAllCount();
	
	public Department  findDepartment(@Param("departmentId")Integer departmentId);
	
	public Integer saveDepartment(Department department);
	
	public Integer updateDepartment(Department department);
	
	public Integer deleteDepartment(@Param("departmentId")Integer departmentId);
	
}
