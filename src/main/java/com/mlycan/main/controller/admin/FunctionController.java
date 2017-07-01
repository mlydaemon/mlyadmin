package com.mlycan.main.controller.admin;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mlycan.common.web.Constants;
import com.mlycan.common.web.SessionProvider;
import com.mlycan.main.entity.Function;
import com.mlycan.main.service.FunctionService;

@Controller
@RequestMapping(value = { "function"})
public class FunctionController {
	
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<Function> functionList = new ArrayList<Function>();
		List<Function> functions = functionService.findAll(count, curpage, 0);
		 for(Iterator it2 = functions.iterator();it2.hasNext();){
			 Function function = (com.mlycan.main.entity.Function) it2.next();
             List<Function> childChannels = functionService.findAll(null, null, function.getFunctionId());
             function.setChildren(childChannels);
             functionList.add(function);
        }
		Integer  total = functionService.findAllCount(null);
		
		model.addAttribute(Constants.BEANS, functionList);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));
		
		session.setAttribute(request, response, Constants.CHANNEL, "function");
		
		return "admin/function/list";
	}
	
	@Autowired
	private FunctionService functionService;
	@Autowired
	private SessionProvider session;
}
