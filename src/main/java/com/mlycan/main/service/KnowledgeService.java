package com.mlycan.main.service;

import java.util.List;


import com.mlycan.main.entity.Knowledge;

public interface KnowledgeService {
	
	public List<Knowledge> findKnowledges(String robotAccount,String application,String semantic);
	
	public Integer deleteKnowledges(Integer questionId,Integer answerId);
}
