package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Channel;

public interface ChannelMapper {
	
	//获取菜单
	public List<Channel>  findForMenu(Integer userId);
	
	//获取菜单
	public List<Channel>  findAll(@Param("count")Integer count,@Param("curpage")Integer curpage,@Param("parentId")Integer parentId);
	
	public Integer findAllCount(@Param("parentId")Integer parentId);
	
	public Channel  findChannel(@Param("channelId")Integer channelId,@Param("channelPath")String channelPath);
	
	public Integer saveChannel(Channel channel);
	
	public Integer updateChannel(Channel channel);
	
	public Integer deleteChannel(@Param("channelId")Integer channelId);
	
}
