package com.mlycan.main.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Department;
import com.mlycan.main.entity.Question;

public interface QuestionService {
	   
		public List<Question>  findAll(Integer count,Integer curpage);

		public Integer findAllCount();
		
		public Question  findQuestion(Integer questionId);
		
		public Integer saveQuestion(String account,String application,String content,String command,String classify,String nextclassify,Integer pattern);
		
		public Integer updateQuestion(Integer  questionId,String account,String application,String content,String command,String classify,String nextclassify,Integer pattern);
		
		public Integer deleteQuestion(Integer questionId);
		//语义库训练机器人账号，场景编码，语义库标识
		public List<Question> findQuestionForTrain(String robotAccount,String application,String semantic);
}
