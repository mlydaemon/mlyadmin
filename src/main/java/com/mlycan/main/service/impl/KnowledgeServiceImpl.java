package com.mlycan.main.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Knowledge;
import com.mlycan.main.mapper.AnswerMapper;
import com.mlycan.main.mapper.KnowledgeMapper;
import com.mlycan.main.mapper.QuestionMapper;
import com.mlycan.main.service.KnowledgeService;

@Service
public class KnowledgeServiceImpl implements KnowledgeService{
	 @Autowired
	 private KnowledgeMapper knowledgeMapper;
	 @Autowired
	 private QuestionMapper questionMapper;
	 @Autowired
	 private AnswerMapper answerMapper;
	@Override
	public List<Knowledge> findKnowledges(String robotAccount, String application, String semantic, String questionCommand) {
		// TODO Auto-generated method stub
		return knowledgeMapper.findKnowledges(robotAccount, application, semantic,questionCommand);
	}
	@Override
	public Integer deleteKnowledges(Integer questionId,Integer answerId) {
		if(questionId!=null){
			questionMapper.deleteQuestion(questionId);
		}
		if(answerId !=null){
			answerMapper.deleteAnswer(answerId);
		}
		/*if(StringUtils.isNotBlank(semantic)&&StringUtils.isNotBlank(questionCommand)&&StringUtils.isNotBlank(questionContent)){
			questionMapper.deleteQuestionByparam(robotAccount, application, semantic, questionCommand, questionContent);
		}
		if(StringUtils.isNotBlank(questionContent)&&StringUtils.isNotBlank(answerContent)&&StringUtils.isNotBlank(answerCommand)){
			answerMapper.deleteAnswerByparam(robotAccount, application, questionContent, answerContent, answerCommand);
		}*/
		return null;
	}
}
