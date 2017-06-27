package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.Channel;

public interface ChannelService {
	    //获取菜单
		public List<Channel>  findChannels(Integer userId);
		//获取菜单
		public List<Channel>  findAll(Integer count,Integer curpage,Integer parentId);

		public Integer findAllCount(Integer parentId);
		
		public Channel  findChannel(Integer chuannelId,String channelPath);
		
		public Integer saveChannel(String  channelName,String  channelPath,String  link,Integer  priority,Integer  content,Integer  display,Integer  parentId);
		
		public Integer updateChannel(Integer  channelId,String  channelName,String  channelPath,String  link,Integer  priority,Integer  content,Integer  display,Integer  parentId);
		
		public Integer deleteChannel(Integer channelId);
		
}
