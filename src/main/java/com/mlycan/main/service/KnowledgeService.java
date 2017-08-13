package com.mlycan.main.service;

import java.util.List;


import com.mlycan.main.entity.Knowledge;

public interface KnowledgeService {
	
	public List<Knowledge> findKnowledges(Integer count,Integer curpage,String robotAccount,String application,String semantic ,String questionCommand);
	
	public Integer findKnowledgesCount(String robotAccount,String application,String semantic ,String questionCommand);
	
	public Integer deleteKnowledges(Integer questionId,Integer answerId);
}
