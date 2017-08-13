package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Answer;

public interface AnswerMapper {

	public List<Answer>  findAll(@Param("startTime")String startTime,@Param("endTime")String endTime,@Param("keywords")String keywords,@Param("application")String application,@Param("semantic")String semantic,@Param("count")Integer count,@Param("curpage")Integer curpage);

	public Integer findAllCount(@Param("startTime")String startTime,@Param("endTime")String endTime,@Param("keywords")String keywords,@Param("application")String application,@Param("semantic")String semantic);
	
	public Answer  findAnswer(@Param("answerId")Integer answerId);
	
	public Integer saveAnswer(Answer answer);
	
	public Integer updateAnswer(Answer answer);
	
	public Integer deleteAnswer(@Param("answerId")Integer answerId);
	
	public Integer deleteAnswerByparam(@Param("robotAccount")String robotAccount,@Param("application")String application,@Param("questionContent")String questionContent, @Param("answerContent")String answerContent, @Param("semantic")String semantic) ;
}
