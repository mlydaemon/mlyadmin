/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Department;
import com.mlycan.main.mapper.DepartmentMapper;
import com.mlycan.main.service.DepartmentService;

/**
 * @author sean
 *
 */
@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentMapper departmentMapper;
	
	@Override
	public List<Department> findAll(Integer count, Integer curpage) {
		// TODO Auto-generated method stub
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return departmentMapper.findAll(count, currentCount);
	}

	public Integer findAllCount(){
		return departmentMapper.findAllCount();
	}
	
	@Override
	public Department findDepartment(Integer departmentId) {
		// TODO Auto-generated method stub
		return departmentMapper.findDepartment(departmentId);
	}
	
	@Override
	public Integer saveDepartment(String  departmentName,Integer  parentId,String  link,Integer  priority,Integer  display) {
		Department department = new Department();
		department.setDepartmentName(departmentName);
		department.setParentId(parentId);
		department.setLink(link);
		department.setPriority(priority);
		department.setDisplay(display);
		
		return departmentMapper.saveDepartment(department);
	}
	@Override
	public Integer updateDepartment(Integer  departmentId,String  departmentName,Integer  parentId,String  link,Integer  priority,Integer  display) {
		
		Department department = departmentMapper.findDepartment(departmentId);
		if(department == null){
			return null;
		}
		if(StringUtils.isNotBlank(departmentName)){
			department.setDepartmentName(departmentName);
		}
		if(parentId != null ){
			department.setParentId(parentId);
		}
		if(StringUtils.isNotBlank(link)){
			department.setLink(link);
		}
		
		if(priority !=null){
			department.setPriority(priority);		
		}
		if(display !=null){
			department.setDisplay(display);
		}
		return departmentMapper.updateDepartment(department);
	}
	@Override
	public Integer deleteDepartment(Integer channelId) {
		// TODO Auto-generated method stub
		return departmentMapper.deleteDepartment(channelId);
	}

}
