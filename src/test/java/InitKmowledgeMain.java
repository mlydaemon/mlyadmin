

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
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
import com.mlycan.main.util.ExcelUtil;

public class InitKmowledgeMain {

	public static void main(String[] args) {
		
		 //initRiddle();    
		 ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		 RepositoryService repositoryService = context.getBean("repositoryService", RepositoryService.class);
		 // TODO Auto-generated method stub
		 //4.语义库中场景关键词  有逻辑 有词库	
	     InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("flowers.xls");
			
		 ExcelUtil eu = new ExcelUtil();
	     List<Object> ls =  eu.importDataFromExcel(new PlantBean(), in, "flowers.xls");
		 for(Object item : ls){
		 	   PlantBean pb = (PlantBean) item;
		 	   System.out.println(pb.getCname()+pb.getLaname()+pb.getNickname()+pb.getKingdom()+pb.getPhylum()
		 	   +pb.getClassify()+pb.getOrder());
		 	  repositoryService.saveRepository("smoon", "FLOWER", "FLOWERCNAME", "中文名称",
		 			 pb.getCname(), String.valueOf(pb.getCname().hashCode()));
		 	  if(StringUtils.isNotBlank(pb.getLaname())){
		 		 repositoryService.saveRepository("smoon", "FLOWER", "FLOWERLANAME", "拉丁名称",
			 			 pb.getLaname(), String.valueOf(pb.getCname().hashCode()));  
		 	  }
		 	 if(StringUtils.isNotBlank(pb.getNickname())){
		 		repositoryService.saveRepository("smoon", "FLOWER", "FLOWERNICKNAME", "别名",
			 			 pb.getNickname(), String.valueOf(pb.getCname().hashCode())); 
		 	  }
		 	if(StringUtils.isNotBlank(pb.getKingdom())){
		 		repositoryService.saveRepository("smoon", "FLOWER", "FLOWERKINGDOM", "界",
			 			 pb.getKingdom(), String.valueOf(pb.getCname().hashCode())); 
		 	  }
		 	if(StringUtils.isNotBlank(pb.getPhylum())){
		 		repositoryService.saveRepository("smoon", "FLOWER", "FLOWERPHYLUM", "门",
			 			 pb.getPhylum(), String.valueOf(pb.getCname().hashCode())); 
		 	  }
		 	if(StringUtils.isNotBlank(pb.getClassify())){
		 		repositoryService.saveRepository("smoon", "FLOWER", "FLOWERCLASS", "纲",
			 			 pb.getClassify(), String.valueOf(pb.getCname().hashCode()));
		 	  }
		 	if(StringUtils.isNotBlank(pb.getOrder())){
		 		repositoryService.saveRepository("smoon", "FLOWER", "FLOWERORDER", "目",
			 			 pb.getOrder(), String.valueOf(pb.getCname().hashCode()));
		 	  }
		 	if(StringUtils.isNotBlank(pb.getFamily())){
		 		repositoryService.saveRepository("smoon", "FLOWER", "FLOWERFAMILY", "科",
			 			 pb.getFamily(), String.valueOf(pb.getCname().hashCode()));
		 	  }
		 	if(StringUtils.isNotBlank(pb.getGenus())){
		 		repositoryService.saveRepository("smoon", "FLOWER", "FLOWERGENUS", "属",
			 			 pb.getGenus(), String.valueOf(pb.getCname().hashCode()));  
		 	  }
		 	if(StringUtils.isNotBlank(pb.getSpecies())){
		 		repositoryService.saveRepository("smoon", "FLOWER", "FLOWERSPECIES", "种",
			 			 pb.getSpecies()+"种", String.valueOf(pb.getCname().hashCode()));
		 	  }
//		 	if(StringUtils.isNotBlank(pb.getWhispers())){
//		 		repositoryService.saveRepository("smoon", "FLOWER", "FLOWERWHISPERS", "花语",
//			 			 pb.getWhispers(), String.valueOf(pb.getCname().hashCode()));
//		 	  }
		 	if(StringUtils.isNotBlank( pb.getSummary())){
		 		repositoryService.saveRepository("smoon", "FLOWER", "FLOWERSUMMARY", "简介",
			 			 pb.getSummary(), String.valueOf(pb.getCname().hashCode()));
		 	  }
		 	if(StringUtils.isNotBlank(pb.getMorphologic())){
		 		repositoryService.saveRepository("smoon", "FLOWER", "FLOWERMORPHOLOGIC", "形态特征",
			 			 pb.getMorphologic(), String.valueOf(pb.getCname().hashCode()));  
		 	  }
		 	if(StringUtils.isNotBlank(pb.getGrowtHabits())){
		 		repositoryService.saveRepository("smoon", "FLOWER", "FLOWERGROWTHABITS", "生长习性",
			 			 pb.getGrowtHabits(), String.valueOf(pb.getCname().hashCode()));
		 	  }
		 	if(StringUtils.isNotBlank(pb.getArea())){
		 		repositoryService.saveRepository("smoon", "FLOWER", "FLOWERAREA", "地理分布",
			 			 pb.getArea(), String.valueOf(pb.getCname().hashCode())); 
		 	  }
		 	if(StringUtils.isNotBlank(pb.getVariety())){
		 		repositoryService.saveRepository("smoon", "FLOWER", "FLOWERVARIETY", "主要品种",
			 			 pb.getVariety(), String.valueOf(pb.getCname().hashCode()));  
		 	  }
		 	if(StringUtils.isNotBlank(pb.getCulture())){
		 		repositoryService.saveRepository("smoon", "FLOWER", "FLOWERCULTURE", "植物文化",
			 			 pb.getCulture(), String.valueOf(pb.getCname().hashCode()));
		 	  }
		 	
		  }
	  
	  
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
