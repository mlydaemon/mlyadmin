package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Department;
import com.mlycan.main.entity.Question;

public interface QuestionMapper {

	public List<Question>  findAll(@Param("keywords")String keywords,@Param("command")String command,@Param("semantic")String semantic,@Param("startTime")String startTime,@Param("endTime")String endTime,@Param("currentCount")Integer currentCount,@Param("count")Integer count);

	public Integer findAllCount(@Param("keywords")String keywords,@Param("command")String command,@Param("semantic")String semantic,@Param("startTime")String startTime,@Param("endTime")String endTime);
	
	public Question  findQuestion(@Param("questionId")Integer questionId);
	
	public Integer saveQuestion(Question question);
	
	public Integer updateQuestion(Question question);
	
	public Integer deleteQuestion(@Param("questionId")Integer questionId);
	//语义库训练机器人账号，场景编码，语义库标识
	public List<Question> findQuestionForTrain(@Param("robotAccount")String robotAccount,@Param("application")String application,@Param("semantic")String semantic);
	
	public Integer deleteQuestionByparam(@Param("robotAccount")String robotAccount,@Param("application")String application,@Param("semantic")String semantic
			,@Param("questionCommand")String questionCommand,@Param("questionContent")String questionContent) ;
}
