package com.mlycan.main.controller.admin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mlycan.common.web.Constants;
import com.mlycan.common.web.SessionProvider;
import com.mlycan.main.controller.BaseController;
import com.mlycan.main.entity.Channel;
import com.mlycan.main.entity.Department;
import com.mlycan.main.entity.Member;
import com.mlycan.main.entity.Position;
import com.mlycan.main.entity.User;
import com.mlycan.main.service.ChannelService;
import com.mlycan.main.service.CustomerService;
import com.mlycan.main.service.DepartmentService;
import com.mlycan.main.service.MemberService;
import com.mlycan.main.service.PositionService;
import com.mlycan.main.service.UserService;

@Controller
@RequestMapping(value = { "user"})
public class UserController extends BaseController{
    
	@RequestMapping(value = { "/list"})
	public String list(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer count,Integer curpage) {
		if(count ==null){
			count = 10;
		}
		if(curpage ==null){
			curpage = 1;
		}
		List<User> users=userService.findAll(count, curpage);

		Integer  total = userService.findAllCount();
		
		model.addAttribute(Constants.BEANS, users);
        
		model.addAttribute(Constants.CURPAGE, curpage);
		
		model.addAttribute(Constants.TALPAGE, (int)Math.ceil((double)total/count));

		session.setAttribute(request, response, Constants.CHANNEL, "user");
		
		return "admin/user/list";
	}
	@RequestMapping(value = { "/delete"})
	public String delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer userId) {
		
		userService.deleteUserByid(userId);

		session.setAttribute(request, response, Constants.CHANNEL, "user");
		
		return "redirect:/admin/user/list";
	}
	@RequestMapping(value = {"/edit"},method = RequestMethod.GET)
	public String edit(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String account) {

		List<Department> departments = departmentService.findAll(null, null);
		List<Department> departmentList = new ArrayList<Department>();
		 for(Iterator it2 = departments.iterator();it2.hasNext();){
			 Department department = (com.mlycan.main.entity.Department) it2.next();
            List<Position> positions = positionService.findAll(null, null,department.getDepartmentId());
            department.setPositions(positions);
            departmentList.add(department);
        }
		 model.addAttribute(Constants.BEANS, departmentList);
		 
		User user = userService.findUserByAccount(account);
		
	    model.addAttribute(Constants.BEAN, user);

		session.setAttribute(request, response, Constants.CHANNEL, "user");
		
		return "admin/user/edit";
	}
	@RequestMapping(value = {"/update" },method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			Integer userId,String  nickname,String  account,String  password,Integer  gender,String  intro,String  comefrom,String  qq,String  email,
			String  phone,String  mobile,String  portrait,String  signature,String  province,
			String  city,String  street,String  country,String  zipcode,Integer[] positions) {
		userService.updateUser(userId, password,positions);
		memberService.updateMemberByid(userId, nickname, gender, null, intro, comefrom, qq, email, phone, mobile, 
				portrait, signature,province,city,street,country,zipcode);

		session.setAttribute(request, response, Constants.CHANNEL, "user");
		
		return "redirect:/admin/user/list";
	}
	@RequestMapping(value = { "/add"})
	public String add(HttpServletRequest request,HttpServletResponse response, ModelMap model) {
		
		List<Department> departments = departmentService.findAll(null, null);
		List<Department> departmentList = new ArrayList<Department>();
		 for(Iterator it2 = departments.iterator();it2.hasNext();){
			 Department department = (com.mlycan.main.entity.Department) it2.next();
            List<Position> positions = positionService.findAll(null, null,department.getDepartmentId());
            department.setPositions(positions);
            departmentList.add(department);
        }
		 
		 model.addAttribute(Constants.BEANS, departmentList);
		session.setAttribute(request, response, Constants.CHANNEL, "user");
		
		return "admin/user/add";
	}
	@RequestMapping(value = {"/save" },method = RequestMethod.POST)
	public String save(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String  account,String  password,String  nickname,Long birthday,Integer  gender,String  intro,String  comefrom,String  qq,String  email,
			String  phone,String  mobile,String  portrait,String  signature,String  province,
			String  city,String  street,String  country,String  zipcode,Integer[] positions) {

		  Integer userId = userService.saveUser(account, password,positions);
		  memberService.saveMember(userId, nickname, gender, birthday, intro, 
				  comefrom, qq, email, phone, mobile, portrait, signature);

			session.setAttribute(request, response, Constants.CHANNEL, "user");
			
		return "redirect:/admin/user/list";
	}
	@Autowired
	private MemberService memberService;
	@Autowired
	private PositionService positionService;
	@Autowired
	private ChannelService channelService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private UserService userService;
	@Autowired
	private SessionProvider session;
}
