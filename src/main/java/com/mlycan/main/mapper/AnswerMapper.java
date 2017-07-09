package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Answer;

public interface AnswerMapper {

	public List<Answer>  findAll(@Param("count")Integer count,@Param("curpage")Integer curpage);

	public Integer findAllCount();
	
	public Answer  findAnswer(@Param("answerId")Integer answerId);
	
	public Integer saveAnswer(Answer answer);
	
	public Integer updateAnswer(Answer answer);
	
	public Integer deleteAnswer(@Param("answerId")Integer answerId);
	
}
