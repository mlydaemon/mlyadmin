/**
 * 
 */
package com.mlycan.main.service.impl;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlycan.main.entity.Member;
import com.mlycan.main.mapper.MemberMapper;
import com.mlycan.main.service.MemberService;

/**
 * @author sean
 *
 */
@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    private MemberMapper  membermapper;
	@Override
	public Member  findMemberByid(Integer memberId){
		
		return membermapper.findMemberByid(memberId);
	}
	@Override
	public Integer updateMemberByid(Integer memberId, String nickname, Integer gender,Long birthday, String intro, String comefrom,
			String qq, String email, String phone, String mobile, String portrait, String signature,String  province,
			String  city,String  street,String  country,String  zipcode) {
		Member member = membermapper.findMemberByid(memberId);
		if(member == null){
			return 0;
		}
		if(StringUtils.isNotBlank(nickname)){
			member.setNickname(nickname);
		}
		if(gender!=null ){
			member.setGender(gender);
		}
		if(birthday !=null && birthday>0){
			member.setBirthday(birthday);
		}
		if(StringUtils.isNotBlank(intro)){
			member.setIntro(intro);
		}
		if(StringUtils.isNotBlank(comefrom)){
			member.setComefrom(comefrom);
		}
		if(StringUtils.isNotBlank(qq)){
			member.setQq(qq);
		}
		if(StringUtils.isNotBlank(email)){
			member.setEmail(email);
		}
		if(StringUtils.isNotBlank(phone)){
			member.setPhone(phone);
		}
		if(StringUtils.isNotBlank(mobile)){
			member.setMobile(mobile);
		}
		if(StringUtils.isNotBlank(portrait)){
			member.setPortrait(portrait);
		}
		if(StringUtils.isNotBlank(signature)){
			member.setSignature(signature);
		}
		if(StringUtils.isNotBlank(province)){
			member.setProvince(province);
		}
		if(StringUtils.isNotBlank(city)){
           member.setCity(city);			
		}
		if(StringUtils.isNotBlank(street)){
			member.setStreet(street);
		}
		if(StringUtils.isNotBlank(country)){
			member.setCountry(country);
		}
		if(StringUtils.isNotBlank(zipcode)){
			member.setZipcode(zipcode);
		}
		return membermapper.updateMemberByid(member);
	}
	@Override
	public Integer saveMember(Integer memberId, String nickname, Integer gender, Long birthday, String intro,
			String comefrom, String qq, String email, String phone, String mobile, String memberImg, String signature) {
		return membermapper.saveMember(memberId, nickname, gender, birthday, intro, comefrom, qq, email, phone, mobile, memberImg, signature);
	}
	@Override
	public Integer deleteMemberByid(Integer memberId) {
		return membermapper.deleteMemberByid(memberId);
	}

}
