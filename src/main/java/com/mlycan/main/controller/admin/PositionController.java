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
import org.springframework.web.bind.annotation.RequestMethod;

import com.mlycan.common.web.Constants;
import com.mlycan.common.web.SessionProvider;
import com.mlycan.main.entity.Channel;
import com.mlycan.main.entity.Department;
import com.mlycan.main.entity.Position;
import com.mlycan.main.service.ChannelService;
import com.mlycan.main.service.DepartmentService;
import com.mlycan.main.service.PositionService;

@Controller
@RequestMapping(value = { "position"})
public class PositionController {
	
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<Position> positions = positionService.findAll(count, curpage,null);

		Integer  total = positionService.findAllCount();
		
		model.addAttribute(Constants.BEANS, positions);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));

		session.setAttribute(request, response, Constants.CHANNEL, "position");
		
		return "admin/position/list";
	}
	@RequestMapping(value = { "/edit"})
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer positionId) {
		
		Position position = positionService.findPosition(positionId);

		List<Department> departments = departmentService.findAll(null, null);
		List<Channel> channelList = new ArrayList<Channel>();
		List<Channel> channels = channelService.findAll(null, null, null);
		 for(Iterator it2 = channels.iterator();it2.hasNext();){
            Channel channel = (com.mlycan.main.entity.Channel) it2.next();
            List<Channel> childChannels = channelService.findAll(null, null, channel.getChannelId());
            channel.setChildren(childChannels);
            channelList.add(channel);
        }
		 model.addAttribute(Constants.CHANNELS, channelList);
		model.addAttribute(Constants.BEANS, departments);
		
		model.addAttribute(Constants.BEAN, position);

		session.setAttribute(request, response, Constants.CHANNEL, "position");
		
		return "admin/position/edit";
	}
	@RequestMapping(value = { "/update"},method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer positionId,String positionName,Integer departmentId,String link,Integer priority,Integer[] permissions) {
		
		positionService.updatePosition(positionId, positionName, departmentId, link, priority,permissions);

		session.setAttribute(request, response, Constants.CHANNEL, "position");
		
		return "redirect:/admin/position/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model) {

		List<Department> departments = departmentService.findAll(null, null);
		
		model.addAttribute(Constants.BEANS, departments);
		List<Channel> channelList = new ArrayList<Channel>();
		List<Channel> channels = channelService.findAll(null, null, null);
		 for(Iterator it2 = channels.iterator();it2.hasNext();){
            Channel channel = (com.mlycan.main.entity.Channel) it2.next();
            List<Channel> childChannels = channelService.findAll(null, null, channel.getChannelId());
            channel.setChildren(childChannels);
            channelList.add(channel);
       }
		 model.addAttribute(Constants.CHANNELS, channelList);
		 
		session.setAttribute(request, response, Constants.CHANNEL, "position");
		
		return "admin/position/add";
	}
	@RequestMapping(value = { "/save"},method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String positionName,Integer departmentId,String link,Integer priority,Integer[] permissions) {
		
		positionService.savePosition(positionName, departmentId, link, priority,permissions);
		
		session.setAttribute(request, response, Constants.CHANNEL, "position");
		
		return "redirect:/admin/position/list";
	}
	@RequestMapping(value = { "/delete"})
	public String delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer positionId,String positionPath) {
		
		positionService.deletePosition(positionId);

		session.setAttribute(request, response, Constants.CHANNEL, "position");
		
		return "redirect:/admin/position/list";
	}
	@Autowired
	private PositionService positionService;
	@Autowired
	private ChannelService channelService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private SessionProvider session;
}
