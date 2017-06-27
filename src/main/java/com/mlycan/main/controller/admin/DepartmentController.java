package com.mlycan.main.controller.admin;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mlycan.common.web.Constants;
import com.mlycan.common.web.SessionProvider;
import com.mlycan.main.entity.Department;
import com.mlycan.main.service.DepartmentService;

@Controller
@RequestMapping(value = { "department"})
public class DepartmentController {
	
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<Department> departments = departmentService.findAll(count, curpage);

		Integer  total = departmentService.findAllCount();
		
		model.addAttribute(Constants.BEANS, departments);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));

		session.setAttribute(request, response, Constants.CHANNEL, "department");
		
		return "admin/department/list";
	}
	@RequestMapping(value = { "/edit"})
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer departmentId) {
		
		Department department = departmentService.findDepartment(departmentId);

		model.addAttribute(Constants.BEAN, department);

		session.setAttribute(request, response, Constants.CHANNEL, "department");
		
		return "admin/department/edit";
	}
	@RequestMapping(value = { "/update"},method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer departmentId,String departmentName,Integer parentId,String link,Integer priority) {
		
		departmentService.updateDepartment(departmentId, departmentName, parentId, link, priority,1);

		session.setAttribute(request, response, Constants.CHANNEL, "department");
		
		return "redirect:/admin/department/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model) {

		session.setAttribute(request, response, Constants.CHANNEL, "department");
		
		
		return "admin/department/add";
	}
	@RequestMapping(value = { "/save"},method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String departmentName,Integer parentId,String link,Integer priority) {
		
		departmentService.saveDepartment(departmentName, parentId, link, priority, 1);

		session.setAttribute(request, response, Constants.CHANNEL, "department");
		
		return "redirect:/admin/department/list";
	}
	@RequestMapping(value = { "/delete"})
	public String delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer departmentId,String departmentPath) {
		
		departmentService.deleteDepartment(departmentId);

		session.setAttribute(request, response, Constants.CHANNEL, "department");
		
		return "redirect:/admin/department/list";
	}
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private SessionProvider session;
}
