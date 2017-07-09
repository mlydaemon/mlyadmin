package com.mlycan.main.service;

import java.util.List;

import com.mlycan.main.entity.Answer;

public interface AnswerService {
	   
		public List<Answer>  findAll(Integer count,Integer curpage);

		public Integer findAllCount();
		
		public Answer  findAnswer(Integer answerId);
		
		public Integer saveAnswer(String account,String application,String question,String content,String command,Integer pattern);
		
		public Integer updateAnswer(Integer  answerId,String account,String application,String question,String content,String command,Integer pattern);
		
		public Integer deleteAnswer(Integer answerId);
		
}
