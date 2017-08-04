/**
 * 
 */
package com.mlycan.main.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Department;
import com.mlycan.main.entity.Question;
import com.mlycan.main.mapper.QuestionMapper;
import com.mlycan.main.service.DepartmentService;
import com.mlycan.main.service.QuestionService;

/**
 * @author sean
 *
 */
@Service
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    private QuestionMapper questionMapper;
	
	@Override
	public List<Question> findAll(Integer count, Integer curpage) {
		// TODO Auto-generated method stub
		Integer currentCount = 0;
		if(count!=null && curpage!= null){
			currentCount = (curpage-1)*count;
		}
		return questionMapper.findAll(currentCount, count);
	}

	public Integer findAllCount(){
		return questionMapper.findAllCount();
	}
	
	@Override
	public Question findQuestion(Integer questionId) {
		// TODO Auto-generated method stub
		return questionMapper.findQuestion(questionId);
	}
	
	@Override
	public Integer saveQuestion(String account,String application,String content,String command,String classify,String nextclassify,Integer pattern) {
		Question question = new Question();
		question.setAccount(account);
		question.setApplication(application);
		question.setContent(content);
		question.setCommand(command);
		question.setClassify(classify);
		question.setNextclassify(nextclassify);
		question.setPattern(pattern);
		return questionMapper.saveQuestion(question);
	}
	@Override
	public Integer updateQuestion(Integer  questionId,String account,String application,String content,String command,String classify,String nextclassify,Integer  pattern) {
		
		Question question = questionMapper.findQuestion(questionId);
		if(question == null){
			return null;
		}
		if(StringUtils.isNotBlank(account)){
			question.setAccount(account);
		}
		if(application != null ){
			question.setApplication(application);
		}
		if(content !=null){
			question.setContent(content);
		}
		if(command !=null){
			question.setCommand(command);
		}
		if(classify !=null){
			question.setClassify(classify);
		}
		if(nextclassify !=null){
			question.setNextclassify(nextclassify);
		}
		if(pattern !=null){
			question.setPattern(pattern);
		}
		return questionMapper.updateQuestion(question);
	}
	@Override
	public Integer deleteQuestion(Integer questionId) {
		return questionMapper.deleteQuestion(questionId);
	}

	@Override
	public List<Question> findQuestionForTrain(String robotAccount, String application, String semantic) {
		// TODO Auto-generated method stub
		if(StringUtils.isBlank(robotAccount)||StringUtils.isBlank(application)||StringUtils.isBlank(semantic)){
			return null;
		}
		return questionMapper.findQuestionForTrain(robotAccount, application, semantic);
	}

}
