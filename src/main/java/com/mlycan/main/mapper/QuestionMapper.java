package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Department;
import com.mlycan.main.entity.Question;

public interface QuestionMapper {

	public List<Question>  findAll(@Param("count")Integer count,@Param("curpage")Integer curpage);

	public Integer findAllCount();
	
	public Question  findQuestion(@Param("questionId")Integer questionId);
	
	public Integer saveQuestion(Question question);
	
	public Integer updateQuestion(Question question);
	
	public Integer deleteQuestion(@Param("questionId")Integer questionId);
	
}
