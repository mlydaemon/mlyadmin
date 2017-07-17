

import java.text.SimpleDateFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mlycan.main.entity.Member;
import com.mlycan.main.entity.User;
import com.mlycan.main.mapper.UserMapper;
import com.mlycan.main.service.MemberService;
import com.mlycan.main.service.ResourceService;
import com.mlycan.main.service.UserService;

public class Main {

	public static void main(String[] args) {
		//ApplicationContext context = 
			      // new ClassPathXmlApplicationContext("appContext.xml");
			   //UserService ump = context.getBean("userService",UserService.class);
			   //ump.updateUser("admin", "admin1");
			   //User s = ump.adminLogin("admins", "admin");
			  // ump.saveUser("admins", "admins");
			  // System.out.println(s.getAccount());
			 /*  ump.deleteUserByid(3);
			  MemberService ms = context.getBean("memberService",MemberService.class);
			   ms.updateMemberByid(1, "mlycan", 2, System.currentTimeMillis(), "mlycan","mlycan", "mlycan", "mlycan", "mlycan", "mlycan", "mlycan", "mlycan");
			   //ms.saveMember(2, "mlycan", 1, System.currentTimeMillis(), "mlycan","mlycan", "mlycan", "mlycan", "mlycan", "mlycan", "mlycan", "mlycan");
				  
			   Member member = ms.findMemberByid(2);
			   SimpleDateFormat myFmt2=new SimpleDateFormat("yyyy-MM-dd");//等价于now.toLocaleString()
			   System.out.println(member.getEmail()+myFmt2.format(member.getBirthday()));
			   Integer count = ms.deleteMemberByid(5);
			   System.out.println(count);*/
			   //ResourceService mss= context.getBean("resourceService",ResourceService.class);
			   
			   //Integer Id= mss.saveResource("sds", "sds", "sds", "sds", "sds", "sds", "sds");
				
	}

}
