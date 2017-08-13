package com.mlycan.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Reply;
import com.mlycan.main.entity.Semantic;
import com.mlycan.main.mapper.ReplyMapper;
import com.mlycan.main.mapper.SemanticMapper;
import com.mlycan.main.service.ReplyService;
@Service
public class ReplyServiceImpl implements ReplyService{
	@Autowired
    private ReplyMapper replyMapper;
	@Override
	public List<Reply> findList(String account, String application, String semantic) {
		// TODO Auto-generated method stub
		return replyMapper.findList(account, application, semantic);
	}

	@Override
	public Integer replaceReply(String application, String semantic, String keyword, String content, Integer precision,
			String remark) {
		Reply reply = new Reply();
		reply.setAccount("smoon");
		reply.setApplication(application);
		reply.setSemantic(semantic);
		reply.setKeyword(keyword);
		reply.setContent(content);
		reply.setPrecision(precision);
		reply.setRemark(remark);
		return replyMapper.replaceReply(reply);
	}

	@Override
	public Integer deleteReply(Integer replyId) {
		// TODO Auto-generated method stub
		return replyMapper.deleteReply(replyId);
	}

}
