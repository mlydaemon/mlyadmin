package com.mlycan.main.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Customer;
import com.mlycan.main.entity.Reply;
import com.mlycan.main.entity.Semantic;

public interface ReplyService {
	
	    //配置语义库
		public List<Reply>  findList(String  account,String  application,String  semantic);
		
		public Integer  replaceReply(String  application,String  semantic,String  keyword,String  content,Integer  precision,String  remark);
		/*获取语义库详情*/
		public Integer  deleteReply(Integer replyId);
		
}
