package com.mlycan.main.mapper;


import org.apache.ibatis.annotations.Param;

import com.mlycan.main.entity.Member;

public interface MemberMapper {
	
	/*获取会员详情*/
	public Member  findMemberByid(@Param("memberId")Integer memberId);
	
	/*更新会员详情*/
	public Integer  updateMemberByid(Member member);
	/*保存会员详情*/
	public Integer  saveMember(@Param("memberId")Integer memberId,@Param("nickname")String  realname,@Param("gender")Integer  gender,
			@Param("birthday")Long birthday,@Param("intro")String  intro,@Param("comefrom")String  comefrom,
			@Param("qq")String  qq,@Param("email")String  email,@Param("phone")String  phone,@Param("mobile")String  mobile,
			@Param("portrait")String  portrait,@Param("signature")String  signature);
	
	/*获取会员详情*/
	public Integer  deleteMemberByid(@Param("memberId")Integer memberId);
	
}
