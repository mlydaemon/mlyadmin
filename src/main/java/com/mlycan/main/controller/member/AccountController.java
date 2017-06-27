/**
 * 
 */
package com.mlycan.main.controller.member;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mlycan.common.web.Constants;
import com.mlycan.main.entity.Member;
import com.mlycan.main.service.MemberService;
import com.mlycan.main.service.UserService;

/**
 * @author sean
 *
 */
@Controller  
@RequestMapping("account")  
public class AccountController {

	@RequestMapping(value = { "/", "/index" })
	public String index(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		Integer memberId = 1;
		Member member = memberService.findMemberByid(memberId);
	    model.addAttribute(Constants.BEAN, member);
		return "member/account/index";
	}
	@RequestMapping(value = {"/modify" },method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String  nickname,Integer  gender,String  intro,String  comefrom,String  qq,String  email,
			String  phone,String  mobile,String  portrait,String  signature,String  province,
			String  city,String  street,String  country,String  zipcode) {

		memberService.updateMemberByid(1, nickname, gender, null, intro, comefrom, qq, email, phone, mobile, 
				portrait, signature,province,city,street,country,zipcode);
		
		return "redirect:/member/account/detail/index";
	}
	@RequestMapping(value = {"/edit/{segment}"},method = RequestMethod.GET)
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			@PathVariable String segment) {
		
		Integer memberId = 1;
		Member member = memberService.findMemberByid(memberId);
	    model.addAttribute(Constants.BEAN, member);
		
		return "member/account/edit/"+segment;
	}
	@RequestMapping(value = {"/detail/{segment}" },method = RequestMethod.GET)
	public String detail(HttpServletRequest request,
			HttpServletResponse response, ModelMap model,@PathVariable String segment) {
		
		Integer memberId = 1;
		Member member = memberService.findMemberByid(memberId);
	    model.addAttribute(Constants.BEAN, member);
			return "member/account/detail/"+segment;	
	}
	@RequestMapping(value = {"/repassword" },method = RequestMethod.GET)
	public String repassword(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String  password,String  repassword,String  repassword1) {

		userService.updateUser(1, repassword,null);
		
		return "member/account/password";
	}
	
	@Autowired
	private MemberService memberService;
	@Autowired
	private UserService userService;
	
}
