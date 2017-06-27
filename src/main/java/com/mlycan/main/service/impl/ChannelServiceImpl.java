/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Channel;
import com.mlycan.main.mapper.ChannelMapper;
import com.mlycan.main.service.ChannelService;

/**
 * @author sean
 *
 */
@Service
public class ChannelServiceImpl implements ChannelService{
    @Autowired
    private ChannelMapper channelmapper;
	@Override
	public List<Channel> findChannels(Integer userId) {
		
		return channelmapper.findForMenu(userId);
	}
	@Override
	public List<Channel> findAll(Integer count, Integer curpage,Integer parentId) {
		// TODO Auto-generated method stub
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return channelmapper.findAll(count, currentCount,parentId);
	}
	@Override
	public Integer findAllCount(Integer parentId){
		// TODO Auto-generated method stub
		return channelmapper.findAllCount(parentId);
	}
	
	@Override
	public Channel findChannel(Integer chuannelId, String channelPath) {
		// TODO Auto-generated method stub
		return channelmapper.findChannel(chuannelId, channelPath);
	}
	
	@Override
	public Integer saveChannel(String  channelName,String  channelPath,String  link,Integer  priority,Integer  content,Integer  display,Integer  parentId) {
		Channel channel = new Channel();
		channel.setParentId(parentId==null?0:parentId);
		channel.setChannelName(channelName);
		channel.setChannelPath(channelPath);
		channel.setContent(content);
		channel.setLink(link);
		channel.setPriority(priority);
		channel.setDisplay(display);
		
		return channelmapper.saveChannel(channel);
	}
	@Override
	public Integer updateChannel(Integer  channelId,String  channelName,String  channelPath,String  link,Integer  priority,Integer  content,Integer  display,Integer  parentId) {
		
		Channel channel = channelmapper.findChannel(channelId, channelPath);
		if(channel == null){
			return null;
		}
		if(StringUtils.isNotBlank(channelName)){
			channel.setChannelName(channelName);
		}
		if(StringUtils.isNotBlank(channelPath)){
			channel.setChannelPath(channelPath);	
		}
		if(StringUtils.isNotBlank(link)){
			channel.setLink(link);
		}
		if(priority !=null){
			channel.setPriority(priority);		
		}
		if(parentId !=null){
			channel.setParentId(parentId);		
		}
		if(content !=null){
			channel.setContent(content);
		}
		if(display !=null){
			channel.setDisplay(display);
		}
		return channelmapper.updateChannel(channel);
	}
	@Override
	public Integer deleteChannel(Integer channelId) {
		// TODO Auto-generated method stub
		return channelmapper.deleteChannel(channelId);
	}

}
