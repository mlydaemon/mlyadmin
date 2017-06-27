/**
 * 
 */
package com.mlycan.main.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mlycan.main.controller.BaseController;
import com.mlycan.main.entity.User;
import com.mlycan.main.service.MemberService;
import com.mlycan.main.service.UserService;

/**
 * @author sean
 *
 */
@Controller  
public class RegisterController extends BaseController{
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String welcome() {
		return "register";
	}
	@RequestMapping(value="/register", method=RequestMethod.POST)  
	public String register(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			String account,String password,String repassword,String  nickname) {
		String resultPageURL = InternalResourceViewResolver.FORWARD_URL_PREFIX + "/admin/main";  
        //获取HttpSession中的验证码  
        String verifyCode = (String)request.getSession().getAttribute("verifyCode");  
        //获取用户请求表单中输入的验证码  
        String submitCode = WebUtils.getCleanParam(request, "verifyCode");  
        System.out.println("用户[" + account + "]注册时输入的验证码为[" + submitCode + "],HttpSession中的验证码为[" + verifyCode + "]");  
        if (StringUtils.isEmpty(submitCode) || !StringUtils.equals(verifyCode, submitCode.toLowerCase())){  
            request.setAttribute("message_login", "验证码不正确");  
            return resultPageURL;  
        }  
        
        Integer userId = userService.saveUser(account, password,null);
        
        memberService.saveMember(userId, nickname, null, null, null, null, null, null, null, null, null, null);
        
		return "titles/index";
	}
	
	@Autowired
	private UserService userService;
	@Autowired
	private MemberService memberService;
}
