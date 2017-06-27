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
import com.mlycan.main.service.ChannelService;

@Controller
@RequestMapping(value = { "channel"})
public class ChannelController {
	
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<Channel> channelList = new ArrayList<Channel>();
		List<Channel> channels = channelService.findAll(count, curpage, null);
		 for(Iterator it2 = channels.iterator();it2.hasNext();){
             Channel channel = (com.mlycan.main.entity.Channel) it2.next();
             List<Channel> childChannels = channelService.findAll(null, null, channel.getChannelId());
             channel.setChildren(childChannels);
             channelList.add(channel);
        }
		Integer  total = channelService.findAllCount(null);
		
		model.addAttribute(Constants.BEANS, channelList);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));
		
		session.setAttribute(request, response, Constants.CHANNEL, "channel");
		
		return "admin/channel/list";
	}
	@RequestMapping(value = { "/edit"})
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer channelId,String channelPath) {
		
		Channel channel = channelService.findChannel(channelId, channelPath);
		
		List<Channel> channels = channelService.findAll(null, null, null);

		model.addAttribute(Constants.BEANS, channels);
		
		model.addAttribute(Constants.BEAN, channel);

		session.setAttribute(request, response, Constants.CHANNEL, "channel");
		
		return "admin/channel/edit";
	}
	@RequestMapping(value = { "/update"},method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer parentId,Integer display,Integer channelId,String channelName,String channelPath,String link,Integer priority) {
		
		channelService.updateChannel(channelId, channelName, channelPath, link, priority, 0, display,parentId);

		session.setAttribute(request, response, Constants.CHANNEL, "channel");
		
		return "redirect:/admin/channel/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model) {
		
		List<Channel> channels = channelService.findAll(null, null, null);

		model.addAttribute(Constants.BEANS, channels);
		
		session.setAttribute(request, response, Constants.CHANNEL, "channel");
		
		return "admin/channel/add";
	}
	@RequestMapping(value = { "/save"},method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer parentId,Integer display,String channelName,String channelPath,String link,Integer priority) {
		
		channelService.saveChannel(channelName, channelPath, link, priority, 0, display,parentId);

		session.setAttribute(request, response, Constants.CHANNEL, "channel");
		
		return "redirect:/admin/channel/list";
	}
	@RequestMapping(value = { "/delete"})
	public String delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer channelId,String channelPath) {
		
		channelService.deleteChannel(channelId);

		session.setAttribute(request, response, Constants.CHANNEL, "channel");
		
		return "redirect:/admin/channel/list";
	}
	@Autowired
	private ChannelService channelService;
	@Autowired
	private SessionProvider session;
}
