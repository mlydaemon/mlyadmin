package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Semantic;

public interface SemanticMapper {

	//配置语义库
	public List<Semantic>  findList(@Param("account")String  account,@Param("application")String  application,@Param("semantic")String  semantic);
	
	
	public Integer  replaceSemantic(Semantic semantic);
	/*获取会员详情*/
	public Integer  deleteSemantic(@Param("semanticId")Integer semanticId);
}
