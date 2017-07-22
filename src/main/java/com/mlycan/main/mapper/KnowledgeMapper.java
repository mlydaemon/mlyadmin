package com.mlycan.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Knowledge;

public interface KnowledgeMapper {
	//语义库训练机器人账号，场景编码，语义库标识
	public List<Knowledge> findKnowledges(@Param("robotAccount")String robotAccount,@Param("application")String application,@Param("semantic")String semantic);
}
