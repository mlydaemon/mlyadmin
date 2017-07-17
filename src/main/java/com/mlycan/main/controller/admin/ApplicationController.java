/**
 * 
 */
package com.mlycan.main.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import org.apache.shiro.web.util.SavedRequest;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.RequestToViewNameTranslator;

import com.mlycan.common.web.Constants;
import com.mlycan.common.web.SessionProvider;
import com.mlycan.main.entity.Application;
import com.mlycan.main.service.ApplicationService;

/**
 * 
 */
@Controller
@RequestMapping(value={"application"})
public class ApplicationController {
	@RequestMapping(value={"/list"})
		public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
				Integer count,Integer curpage) {
			if(count ==null){
				count = 10;
			}
			if(curpage ==null){
				curpage = 1;
			}
			List<Application> applications = applicationService.findAll(count, curpage);

			Integer  total = applicationService.findAllCount();
			
			model.addAttribute(Constants.BEANS, applications);
	        
			model.addAttribute(Constants.CURPAGE, curpage);
			
			model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));

			session.setAttribute(request, response, Constants.CHANNEL, "application");
			
			return "admin/application/list";
		}
	@RequestMapping(value={"/add"})
	public String add(HttpServletRequest request,HttpServletResponse response,ModelMap model){
			
			session.setAttribute(request, response, Constants.CHANNEL,"application");
		
			return "admin/application/add";
	}
	@RequestMapping(value={"/save"} ,method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response,ModelMap model,
			String account,String application,String appName,String classify,String semantic,Integer active){
			applicationService.saveApplication(account, application, appName, classify, semantic, active);

			session.setAttribute(request, response, Constants.CHANNEL, "application");
			return "redirect:/admin/application/list";
	}
	@RequestMapping(value={"/edit"})
	public String edit(HttpServletRequest request,HttpServletResponse response,ModelMap model,Integer appId){
		
		 Application application= applicationService.findApplication(appId);
		 
		 model.addAttribute(Constants.BEAN, application);
		 
		 session.setAttribute(request, response, Constants.CHANNEL, "application");
		 
		return "admin/application/edit";
	}
	@RequestMapping(value={"/update"},method=RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response,ModelMap model,
			Integer appId,String account,String application,String appName,String classify,String semantic,Integer active){
		applicationService.updateApplication(appId, account, application, appName, classify, semantic, active);
		session.setAttribute(request, response, Constants.CHANNEL, "application");
		return "redirect:/admin/application/list";
	}
	@RequestMapping(value={"/delete"})
	public String delete(HttpServletRequest request,HttpServletResponse response,ModelMap model,
			Integer appId){
		applicationService.deleteApplication(appId);
		session.setAttribute(request, response, Constants.CHANNEL, "application");
		
		return "redirect:/admin/application/list";
	}
	@Autowired
	private ApplicationService applicationService;
	@Autowired
	private SessionProvider session;
}
