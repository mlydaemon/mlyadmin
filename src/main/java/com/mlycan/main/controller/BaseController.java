package com.mlycan.main.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;


public class BaseController {
    /**
     * serialVersionUID:TODO
     *
     * @since v1.0
     */

    protected static Logger logger = Logger.getLogger(BaseController.class);
    
	/**
     * 
     * <p>把对象转换成json数据并写入到response对象<p>
     *
     * @param obj
     * @throws JsonGenerationException
     * @throws JsonMappingException
     * @throws IOException
     * @throws 
     * @since v1.0
     */
    public void writeObject(HttpServletResponse response,Object obj)
    {
    	 response.setHeader("Content-type", "text/html;charset=UTF-8"); 
         response.setCharacterEncoding("UTF-8");
        try
        {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(System.out,obj);  
            mapper.writeValue(response.getWriter(),obj);
        }
        catch (Exception e)
        {
        	
            logger.error(e.getMessage());
        }
    }
}
