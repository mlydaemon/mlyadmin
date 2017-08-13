package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Reply;

public interface ReplyMapper {

	//配置语义库
	public List<Reply>  findList(@Param("account")String  account,@Param("application")String  application,@Param("semantic")String  semantic);
	
	public Integer  replaceReply(Reply reply);
	/*获取会员详情*/
	public Integer  deleteReply(@Param("replyId")Integer replyId);
}
