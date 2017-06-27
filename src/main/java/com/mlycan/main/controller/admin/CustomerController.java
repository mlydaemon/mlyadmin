package com.mlycan.main.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mlycan.common.web.Constants;
import com.mlycan.common.web.SessionProvider;
import com.mlycan.main.controller.BaseController;
import com.mlycan.main.entity.Customer;
import com.mlycan.main.entity.Member;
import com.mlycan.main.entity.User;
import com.mlycan.main.service.CustomerService;
import com.mlycan.main.service.MemberService;
import com.mlycan.main.service.UserService;

@Controller
@RequestMapping(value = { "customer"})
public class CustomerController extends BaseController{
    
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}

		
		List<Customer> customers=customerService.findAll(count, curpage);

		Integer  total = customerService.findAllCount();
		
		model.addAttribute(Constants.BEANS, customers);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));

		session.setAttribute(request, response, Constants.CHANNEL, "customer");
		
		return "admin/customer/list";
	}
	@RequestMapping(value = {"/edit"},method = RequestMethod.GET)
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer customerId) {
		
		Member member = memberService.findMemberByid(customerId);
	    model.addAttribute(Constants.BEAN, member);

		session.setAttribute(request, response, Constants.CHANNEL, "customer");
		
		return "admin/customer/edit";
	}
	@RequestMapping(value = {"/update" },method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer customerId,String  nickname,Integer  gender,String  intro,String  comefrom,String  qq,String  email,
			String  phone,String  mobile,String  portrait,String  signature,String  province,
			String  city,String  street,String  country,String  zipcode) {

		memberService.updateMemberByid(customerId, nickname, gender, null, intro, comefrom, qq, email, phone, mobile, 
				portrait, signature,province,city,street,country,zipcode);

		session.setAttribute(request, response, Constants.CHANNEL, "customer");
		
		return "redirect:/admin/customer/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model) {

		session.setAttribute(request, response, Constants.CHANNEL, "customer");
		
		return "admin/customer/add";
	}
	@RequestMapping(value = {"/save" },method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String  account,String  password,String  nickname,Long birthday,Integer  gender,String  intro,String  comefrom,String  qq,String  email,
			String  phone,String  mobile,String  portrait,String  signature,String  province,
			String  city,String  street,String  country,String  zipcode) {

		  Integer userId = userService.saveUser(account, password,null);
		  memberService.saveMember(userId, nickname, gender, birthday, intro, 
				  comefrom, qq, email, phone, mobile, portrait, signature);

			session.setAttribute(request, response, Constants.CHANNEL, "customer");
			
		return "redirect:/admin/customer/list";
	}
	@Autowired
	private CustomerService customerService;
	@Autowired
	private MemberService memberService;
	@Autowired
	private UserService userService;
	@Autowired
	private SessionProvider session;
}
