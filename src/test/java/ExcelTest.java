

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mlycan.main.entity.Customer;
import com.mlycan.main.service.CustomerService;
import com.mlycan.main.util.ExcelUtil;

public class ExcelTest {

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
		// TODO Auto-generated method stub
       // BufferedReader br = new BufferedReader(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream("morpheme.dic"), "UTF-8"));
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("riddles.xls");
		
        InputStream is = new FileInputStream(new File("C:\\Users\\sean\\workspace\\mlymoon\\src\\main\\resources\\riddles.xls"));
		ExcelUtil eu = new ExcelUtil();
        List<Object> ls =  eu.importDataFromExcel(new Item(), in, "riddles.xls");
           for(Object item : ls){
        	   Item i = (Item) item;
        	   System.out.println(i.getAnswer()+"##"+i.getConundrum());
           }
        String[] excelHeader = { "所属区域（地市）", "机房", "机架资源情况",  
        	    "", "端口资源情况",  "机位资源情况", "", "", "设备资源情况",  
        	    "", "", "IP资源情况", "", "", "", "", "网络设备数" };
      /*ApplicationContext context = 
	       new ClassPathXmlApplicationContext("appContext.xml");
	   CustomerService customerService = context.getBean("customerService",CustomerService.class);
        List<Customer> customers=customerService.findAll(null, null);
        FileOutputStream fout = new FileOutputStream("I:/students.xls");  
		ExcelUtil eu = new ExcelUtil();
		eu.exportDataToExcel(customers, excelHeader, "dddddd", fout);*/
	}

}
