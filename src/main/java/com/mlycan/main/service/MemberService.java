package com.mlycan.main.service;

import com.mlycan.main.entity.Member;

public interface MemberService {
	//获取菜单
	public Member  findMemberByid(Integer memberId);
	public Integer  updateMemberByid(Integer memberId,String  realname,Integer  gender,
			Long birthday,String  intro,String  comefrom,
			String  qq,String  email,String  phone,String  mobile,
			String  memberImg,String  signature,String  province,
			String  city,String  street,String  country,String  zipcode);
	/*保存会员详情*/
	public Integer  saveMember(Integer memberId,String  realname,Integer  gender,
			Long birthday,String  intro,String  comefrom,
			String  qq,String  email,String  phone,String  mobile,
			String  memberImg,String  signature);
	
	/*删除会员详情*/
	public Integer  deleteMemberByid(Integer memberId);
}
