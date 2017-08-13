package com.mlycan.main.controller.admin;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mlycan.common.web.Constants;
import com.mlycan.common.web.SessionProvider;
import com.mlycan.main.controller.BaseController;
import com.mlycan.main.entity.Customer;
import com.mlycan.main.entity.CustomerImport;
import com.mlycan.main.entity.Knowledge;
import com.mlycan.main.entity.Member;
import com.mlycan.main.entity.Repository;
import com.mlycan.main.entity.User;
import com.mlycan.main.service.CustomerService;
import com.mlycan.main.service.MemberService;
import com.mlycan.main.service.UserService;
import com.mlycan.main.util.ExcelUtil;

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
	@RequestMapping(value = { "/upload"})
	@ResponseBody
	public void upload(HttpServletRequest request,HttpServletResponse response, ModelMap model) throws Exception {
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		InputStream in =null; 
		 MultipartFile file = multipartRequest.getFile("upfile");  
	        if(file.isEmpty()){  
	            throw new Exception("文件不存在！");  
	        }  
	        ExcelUtil eu = new ExcelUtil();
	        in = file.getInputStream();  
	        List<Object>  customers=  eu.importDataFromExcel(new CustomerImport(), in, file.getOriginalFilename());
           for(Object item : customers){
        	   CustomerImport i = (CustomerImport) item;
        	   System.out.println(i.getNickname()+"##"+i.getCity());
        	   if(StringUtils.isBlank(i.getGender())){
        		   i.setGender("0");
        	   }
        	   if(StringUtils.isBlank(i.getBirthday())){
        		   i.setBirthday("0");
        	   }
        	   memberService.saveMember(null, i.getNickname(), Integer.valueOf(i.getGender()), Long.valueOf(i.getBirthday()),
        			   i.getIntro(), i.getComefrom(), i.getQq(), i.getEmail(), i.getPhone(), i.getMobile(), i.getPortrait(), i.getSignature());
           }
           
            
           Map<String,Object> remap = new HashMap<String,Object>();
    	   remap.put("success", 1);
    	   writeObject(response,remap);
	}
	@RequestMapping(value = { "/export"})
	@ResponseBody
	public void export(HttpServletRequest request,HttpServletResponse response, ModelMap model) throws IOException {
		
		List<Customer> customers=customerService.findAll(null, null);
		
        String[] headers = {"用户序号","账号","密码","真实姓名","性别","出生日期","个人介绍","来自","QQ",
        		"EMAIL","电话","手机","会员头像","会员个性签名","省","市","街道","国家","邮编"};
      //获取目标文件的绝对路径  
        String download = request.getSession().getServletContext().getRealPath("/upload/"); //获取下载路劲
        String fileName="students.xls";
		try {
			ExcelUtil eu = new ExcelUtil();
			FileOutputStream fout = new FileOutputStream(download+Constants.SPT+fileName);
			eu.exportDataToExcel(customers, headers, "客户信息", fout);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 BufferedOutputStream output = null;
         BufferedInputStream input = null;
        try {
        	File file = new File(download+"/students.xls");  //根据文件路径获得File文件
    		//文件名
            response.setHeader("Content-Disposition", "attachment;filename=\""
                + new String(fileName.getBytes(), "ISO8859-1") + "\"");
            response.setContentLength((int) file.length());
            byte[] buffer = new byte[4096];// 缓冲区
           
          output = new BufferedOutputStream(response.getOutputStream());
          input = new BufferedInputStream(new FileInputStream(file));
          int n = -1;
          //遍历，开始下载
          while ((n = input.read(buffer, 0, 4096)) > -1) {
             output.write(buffer, 0, n);
          }
          output.flush();   //不可少
          response.flushBuffer();//不可少
        } catch (Exception e) {
          //异常自己捕捉       
        } finally {
           //关闭流，不可少
           if (input != null)
                input.close();
           if (output != null)
                output.close();
        }
	}
	 @RequestMapping(value = { "/print" },method = RequestMethod.POST)
 	public void print(HttpServletRequest request,HttpServletResponse response, ModelMap model,
 			 Integer customerId) {
 		Map<String,Object> remap = new HashMap<String,Object>();
 		if(customerId==null){
 			remap.put("success", 0);
 		}
 		Integer count=customerService.updatePrint(customerId);
 		remap.put("success", count);
 		writeObject(response,remap);
 	}
	 @RequestMapping(value = { "/delete"})
	 public void delete(HttpServletRequest request,HttpServletResponse response, ModelMap model,
			 @RequestBody String customerIds) {
		 
		 Map<String,Object> remap = new HashMap<String,Object>();
		    ObjectMapper objectMapper =new ObjectMapper();
			JavaType javaType= objectMapper.getTypeFactory().constructParametricType(List.class,Integer.class);
			try {
				List<Integer> list= objectMapper.readValue(customerIds, javaType);
				Integer count=0;
		 		for(Integer customerId:list){
		 			count+=memberService.deleteMemberByid(customerId);
		 		}
		 		remap.put("success", count);
				System.out.println(list);
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	 		
	 		
	 		writeObject(response,remap);
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
