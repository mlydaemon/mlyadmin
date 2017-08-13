/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Answer;
import com.mlycan.main.mapper.AnswerMapper;
import com.mlycan.main.service.AnswerService;

/**
 * @author sean
 *
 */
@Service
public class AnswerServiceImpl implements AnswerService{
    @Autowired
    private AnswerMapper answerMapper;
	
	@Override
	public List<Answer> findAll(String startTime,String endTime,String keywords,String application,String semantic,Integer count, Integer curpage) {
		// TODO Auto-generated method stub
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return answerMapper.findAll(startTime,endTime,keywords,application,semantic,count, currentCount);
	}

	public Integer findAllCount(String startTime,String endTime,String keywords,String application,String semantic){
		return answerMapper.findAllCount(startTime,endTime,keywords,application,semantic);
	}
	
	@Override
	public Answer findAnswer(Integer answerId) {
		// TODO Auto-generated method stub
		return answerMapper.findAnswer(answerId);
	}
	
	@Override
	public Integer saveAnswer(String account,String application,String question,String content,String semantic,Integer pattern) {
		Answer answer = new Answer();
		answer.setAccount(account);
		answer.setApplication(application);
		answer.setQuestion(question);
		answer.setContent(content);
		answer.setSemantic(semantic);
		answer.setPattern(pattern);
		return answerMapper.saveAnswer(answer);
	}
	@Override
	public Integer updateAnswer(Integer  answerId,String account,String application,String question,String content,String semantic,Integer  pattern) {
		
		Answer answer = answerMapper.findAnswer(answerId);
		if(answer == null){
			return null;
		}
		if(StringUtils.isNotBlank(account)){
			answer.setAccount(account);
		}
		if(application != null ){
			answer.setApplication(application);
		}
		if(question !=null){
			answer.setQuestion(question);
		}
		if(content !=null){
			answer.setContent(content);
		}
		if(semantic !=null){
			answer.setSemantic(semantic);
		}
		if(pattern !=null){
			answer.setPattern(pattern);
		}
		return answerMapper.updateAnswer(answer);
	}
	@Override
	public Integer deleteAnswer(Integer answerId) {
		return answerMapper.deleteAnswer(answerId);
	}

}
