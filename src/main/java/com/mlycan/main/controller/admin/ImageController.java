package com.mlycan.main.controller.admin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mlycan.main.controller.BaseController;
import com.mlycan.main.entity.Resource;
import com.mlycan.main.service.MemberService;
import com.mlycan.main.service.ResourceService;
@Controller  
@RequestMapping("image") 
public class ImageController extends BaseController{
	   @RequestMapping("/upload")  
	    public void upload(@RequestParam MultipartFile[] myfiles,HttpServletRequest request,HttpServletResponse response) throws IOException  
	    {  
	      //如果只是上传一个文件，则只需要MultipartFile类型接收文件即可，而且无需显式指定@RequestParam注解   
	        //如果想上传多个文件，那么这里就要用MultipartFile[]类型来接收文件，并且还要指定@RequestParam注解   
	        //并且上传多个文件时，前台表单中的所有<input type="file"/>的name都应该是myfiles，否则参数里的myfiles无法获取到所有上传的文件   
	          Integer resourceId = 0;
	        for(MultipartFile myfile : myfiles){   
	            if(myfile.isEmpty()){   
	                System.out.println("文件未上传");   
	            }else{   
	                System.out.println("文件长度: " + myfile.getSize());   
	                System.out.println("文件类型: " + myfile.getContentType());   
	                System.out.println("文件名称: " + myfile.getName());   
	                System.out.println("文件原名: " + myfile.getOriginalFilename());   
	                System.out.println("========================================");   
	                //如果用的是Tomcat服务器，则文件会上传到  
	                String realPath = "I:/workspace";
	                String originalFileName = myfile.getOriginalFilename();
	                String StoreFileName = System.currentTimeMillis()+"."+originalFileName.substring(originalFileName.lastIndexOf(".")+1);
	                //这里不必处理IO流关闭的问题，因为FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉，我是看它的源码才知道的   
	                FileUtils.copyInputStreamToFile(myfile.getInputStream(), new File(realPath,StoreFileName ));   
	                resourceId = resourceService.saveResource(realPath+"/"+StoreFileName, originalFileName, null, null, null, myfile.getContentType(), myfile.getContentType()); 
	            }   
	        }   
	         String imageUrl = "http://localhost:9999/mywebapp/admin/image/display/"+resourceId;
	         writeObject(response,imageUrl);
	    }
	   @RequestMapping("/display/{resourceId}")  
	    public void display(HttpServletRequest request,HttpServletResponse response,@PathVariable Integer resourceId) throws IOException  
	    {  
		   String filePath = null;
	       Resource resource = resourceService.findResource(resourceId);
	       if(resource !=null){
	    	   filePath = resource.getStorePath();
	       }
	       if(StringUtils.isBlank(filePath)){
	    	   filePath = "I:/workspace/1477318675357.jpg";
	       }
	       File file = new File(filePath); 
	     //判断文件是否存在如果不存在就返回默认图标  
	        if(!(file.exists() && file.canRead())) {  
	            file = new File(request.getSession().getServletContext().getRealPath("/")  
	                    + "I:/workspace/1477318675357.jpg");  
	        }  
	        FileInputStream inputStream = new FileInputStream(file);  
	        byte[] data = new byte[(int)file.length()];  
	        int length = inputStream.read(data);  
	        inputStream.close();  
	  
	        response.setContentType("image/png");  
	  
	        OutputStream stream = response.getOutputStream();  
	        stream.write(data);  
	        stream.flush();  
	        stream.close(); 
	    } 
	   @Autowired
		private ResourceService resourceService;
}
