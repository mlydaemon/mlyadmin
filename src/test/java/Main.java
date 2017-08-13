

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mlycan.common.web.Constants;
import com.mlycan.main.entity.Member;
import com.mlycan.main.entity.Question;
import com.mlycan.main.entity.Riddle;
import com.mlycan.main.entity.User;
import com.mlycan.main.mapper.UserMapper;
import com.mlycan.main.service.MemberService;
import com.mlycan.main.service.RepositoryService;
import com.mlycan.main.service.ResourceService;
import com.mlycan.main.service.RiddleService;
import com.mlycan.main.service.UserService;

public class Main {

	public static void main(String[] args) {
		
		initRiddle();    
			   
	}

	public static void initRiddle() {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		RepositoryService repositoryService = context.getBean("repositoryService", RepositoryService.class);
		RiddleService riddleService = context.getBean("riddleService", RiddleService.class);

		List<Riddle> riddles = riddleService.findAll(null, null);
		for (Riddle riddle : riddles) {

			repositoryService.saveRepository(riddle.getAccount(), "RIDDLE", "RIDDLECONUNDRUM", "谜面",
					riddle.getConundrum(), String.valueOf(riddle.getConundrum().hashCode()));
			repositoryService.saveRepository(riddle.getAccount(), "RIDDLE", "RIDDLEMYSTERY", "谜目", riddle.getMystery(),
					String.valueOf(riddle.getConundrum().hashCode()));
			repositoryService.saveRepository(riddle.getAccount(), "RIDDLE", "RIDDLEREMINDER", "提示",
					riddle.getReminder(), String.valueOf(riddle.getConundrum().hashCode()));
			repositoryService.saveRepository(riddle.getAccount(), "RIDDLE", "RIDDLERANSWER", "谜底", riddle.getAnswer(),
					String.valueOf(riddle.getConundrum().hashCode()));
			repositoryService.saveRepository(riddle.getAccount(), "RIDDLE", "RIDDLEEXPLAIN", "解释", riddle.getExplains(),
					String.valueOf(riddle.getConundrum().hashCode()));
           System.err.println(riddle.getConundrum());
		}
	}
}
