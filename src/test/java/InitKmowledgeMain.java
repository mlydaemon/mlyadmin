

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
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
	public static void main(String[] args) throws UnsupportedEncodingException {
		 
		initMonitor();
	}
	public static void initMonitor() throws UnsupportedEncodingException {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		 RepositoryService repositoryService = context.getBean("repositoryService", RepositoryService.class);
		 // TODO Auto-generated method stub
		 //4.语义库中场景关键词  有逻辑 有词库	
	     InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("monitor.xls");
		 ExcelUtil eu = new ExcelUtil();
	     List<Object> ls =  eu.importDataFromExcel(new MonitorBean(), in, "monitor.xls");
		 int count=1;
	     for(Object item : ls){
	    	 MonitorBean pb = (MonitorBean) item; 
	    	 repositoryService.saveRepository("smoon", "MONITOR", "MONITORRETRIEVE", "检索",
		 			 pb.getTitle(), String.valueOf(pb.getTitle().hashCode()));
	    	 repositoryService.saveRepository("smoon", "MONITOR", "MONITORREPLY", "应答",
		 			 pb.getReply(), String.valueOf(pb.getTitle().hashCode()));
	     }
	}
	public static void initPoetry() throws UnsupportedEncodingException {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		 RepositoryService repositoryService = context.getBean("repositoryService", RepositoryService.class);
		 // TODO Auto-generated method stub
		 //4.语义库中场景关键词  有逻辑 有词库	
	     InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("poetry.xls");
		 ExcelUtil eu = new ExcelUtil();
	     List<Object> ls =  eu.importDataFromExcel(new PoetryBean(), in, "poetry.xls");
		 int count=1;
	     for(Object item : ls){
	    	 PoetryBean pb = (PoetryBean) item;
		 	 System.out.println("古诗词"+(count++)+":"+pb.getTitle());
		 	 repositoryService.saveRepository("smoon", "POETRY", "POETRYTITLE", "标题",
		 			 pb.getTitle(), String.valueOf(pb.getTitle().hashCode()));
		 	if(StringUtils.isNotBlank(pb.getAuthor())){
		 		repositoryService.saveRepository("smoon", "POETRY", "POETRYAUTHOR", "作者",
			 			 pb.getAuthor(), String.valueOf(pb.getTitle().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getType())){
		 		repositoryService.saveRepository("smoon", "POETRY", "POETRYTYPE", "类型",
			 			 pb.getType(), String.valueOf(pb.getTitle().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getOriginal())){
		 		repositoryService.saveRepository("smoon", "POETRY", "POETRYORIGINAL", "原文",
			 			 pb.getOriginal(), String.valueOf(pb.getTitle().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getAnnotation())){
		 		repositoryService.saveRepository("smoon", "POETRY", "POETRYANNOTATION", "注释",
			 			 pb.getAnnotation(), String.valueOf(pb.getTitle().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getTranslation())){
		 		repositoryService.saveRepository("smoon", "POETRY", "POETRYTRANSLATION", "译文",
			 			 pb.getTranslation(), String.valueOf(pb.getTitle().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getAppreciation())){
		 		repositoryService.saveRepository("smoon", "POETRY", "POETRYAPPRECIATION", "鉴赏",
			 			 pb.getAppreciation(), String.valueOf(pb.getTitle().hashCode()));
		 	 }
	     }
	}
	public static void initIdiom() throws UnsupportedEncodingException {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		 RepositoryService repositoryService = context.getBean("repositoryService", RepositoryService.class);
		 // TODO Auto-generated method stub
		 //4.语义库中场景关键词  有逻辑 有词库	
	     InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("idoim.xls");
		 ExcelUtil eu = new ExcelUtil();
	     List<Object> ls =  eu.importDataFromExcel(new IdiomBean(), in, "idoim.xls");
		 int count=1;
	     for(Object item : ls){
	    	 IdiomBean pb = (IdiomBean) item;
		 	 System.out.println("成语"+(count++)+":"+pb.getCname());
		 	 repositoryService.saveRepository("smoon", "IDIOM", "IDIOMCNAME", "名称",
		 			 pb.getCname(), String.valueOf(pb.getCname().hashCode()));
		 	if(StringUtils.isNotBlank(pb.getSpell())){
		 		repositoryService.saveRepository("smoon", "IDIOM", "IDIOMSPELL", "拼音",
			 			 pb.getSpell(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getJspell())){
		 		repositoryService.saveRepository("smoon", "IDIOM", "IDIOMJSPELL", "简拼",
			 			 pb.getJspell(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	 if(StringUtils.isNotBlank(pb.getSynonyms())){
		 		repositoryService.saveRepository("smoon", "IDIOM", "IDIOMSYNONYMS", "近义词",
		 				pb.getSynonyms().replace("&nbsp;", "").substring(0,pb.getSynonyms().replace("&nbsp;", "").length()-1>8000?8000:pb.getSynonyms().replace("&nbsp;", "").length()-2), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getAntonym())){
		 		repositoryService.saveRepository("smoon", "IDIOM", "IDIOMANTONYM", "反义词",
			 			 pb.getAntonym().replace("&nbsp;", "").trim(), String.valueOf(pb.getCname().hashCode()));
		 	 };//
		 	if(StringUtils.isNotBlank(pb.getExplain())){
		 		repositoryService.saveRepository("smoon", "IDIOM", "IDIOMEXPLAIN", "解释",
			 			 pb.getExplain().replace("&nbsp;", "").trim(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	
		 	if(StringUtils.isNotBlank(pb.getProvenance())){
		 		repositoryService.saveRepository("smoon", "IDIOM", "IDIOMPROVENANCE", "出处",
			 			 pb.getProvenance().replace("&nbsp;", "").trim(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getExamples())){
		 		repositoryService.saveRepository("smoon", "IDIOM", "IDIOMEXAMPLES", "例子",
			 			 pb.getExamples().replace("&nbsp;", "").trim(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getDialect())){
		 		repositoryService.saveRepository("smoon", "IDIOM", "IDIOMDIALECT", "歇后语",
			 			 pb.getDialect().replace("&nbsp;", "").trim(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getRiddle())){
		 		repositoryService.saveRepository("smoon", "IDIOM", "IDIOMRIDDLE", "谜语",
			 			 pb.getRiddle().replace("&nbsp;", "").trim(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getStory())){
		 		repositoryService.saveRepository("smoon", "IDIOM", "IDIOMSTORY", "成语故事",
			 			 pb.getStory().replace("&nbsp;", "").trim(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 }
	}
	public static void initFastival() throws UnsupportedEncodingException {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		 RepositoryService repositoryService = context.getBean("repositoryService", RepositoryService.class);
		 // TODO Auto-generated method stub
		 //4.语义库中场景关键词  有逻辑 有词库	
	     InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("festival.xls");
		 ExcelUtil eu = new ExcelUtil();
	     List<Object> ls =  eu.importDataFromExcel(new FestivalBean(), in, "festival.xls");
		 int count=1;
	     for(Object item : ls){
	    	 FestivalBean pb = (FestivalBean) item;
		 	 System.out.println("节日"+(count++)+":"+pb.getCname());
		 	 repositoryService.saveRepository("smoon", "FESTIVAL", "FESTIVALCNAME", "名称",
		 			 pb.getCname(), String.valueOf(pb.getCname().hashCode()));
		 	if(StringUtils.isNotBlank(pb.getType())){
		 		repositoryService.saveRepository("smoon", "FESTIVAL", "FESTIVALTYPE", "类型",
			 			 pb.getType(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getDates())){
		 		repositoryService.saveRepository("smoon", "FESTIVAL", "FESTIVALDATES", "日期",
			 			 pb.getDates(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	 if(StringUtils.isNotBlank(pb.getSummary())){
		 		repositoryService.saveRepository("smoon", "FESTIVAL", "FESTIVALSUMMARY", "简介",
		 				pb.getSummary().replace("&nbsp;", "").substring(0,pb.getSummary().replace("&nbsp;", "").length()-1>8000?8000:pb.getSummary().replace("&nbsp;", "").length()-2), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getOrigin())){
		 		repositoryService.saveRepository("smoon", "FESTIVAL", "FESTIVALORIGIN", "由来",
			 			 pb.getOrigin(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getCustom())){
		 		repositoryService.saveRepository("smoon", "FESTIVAL", "FESTIVALCUSTOM", "习俗",
			 			 pb.getCustom(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getLegend())){
		 		repositoryService.saveRepository("smoon", "FESTIVAL", "FESTIVALLEGEND", "传说",
			 			 pb.getLegend(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getHoliday())){
		 		repositoryService.saveRepository("smoon", "FESTIVAL", "FESTIVALHOLIDAY", "放假安排",
			 			 pb.getHoliday(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 }
	}
	public static void initScenicattractions() throws UnsupportedEncodingException {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		 RepositoryService repositoryService = context.getBean("repositoryService", RepositoryService.class);
		 // TODO Auto-generated method stub
		 //4.语义库中场景关键词  有逻辑 有词库	
	     InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("scenicSpots.xls");
		 ExcelUtil eu = new ExcelUtil();
	     List<Object> ls =  eu.importDataFromExcel(new ScenicSpotBean(), in, "scenicSpots.xls");
		 int count=1;
	     for(Object item : ls){
			 ScenicSpotBean pb = (ScenicSpotBean) item;
		 	 System.out.println("景点"+(count++)+":"+pb.getCname()+pb.getScenic());
		 	 repositoryService.saveRepository("smoon", "SCENICATTRACTIONS", "SCENICATTRACTIONSCNAME", "名称",
		 			 pb.getCname(), String.valueOf(pb.getCname().hashCode()));
		 	if(StringUtils.isNotBlank(pb.getScenic())){
		 		repositoryService.saveRepository("smoon", "SCENICATTRACTIONS", "SCENICATTRACTIONSSCENIC", "景区",
			 			 pb.getScenic(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	 if(StringUtils.isNotBlank(pb.getSummary())){
		 		repositoryService.saveRepository("smoon", "SCENICATTRACTIONS", "SCENICATTRACTIONSSUMMARY", "简介",
		 				pb.getSummary().replace("&nbsp;", "").substring(0,pb.getSummary().replace("&nbsp;", "").length()-1>8000?8000:pb.getSummary().replace("&nbsp;", "").length()-2), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 }
	}
	public static void initScenic() throws UnsupportedEncodingException {
		 ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		 RepositoryService repositoryService = context.getBean("repositoryService", RepositoryService.class);
		 // TODO Auto-generated method stub
		 //4.语义库中场景关键词  有逻辑 有词库	
	     InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("scenics.xls");
		 ExcelUtil eu = new ExcelUtil();
	     List<Object> ls =  eu.importDataFromExcel(new ScenicBean(), in, "scenics.xls");
	     int count=1;
	     for(Object item : ls){
			 ScenicBean pb = (ScenicBean) item;
		 	 System.out.println("景区:"+(count++)+":"+pb.getSummary().getBytes("UTF-8").length+":"+pb.getCname()+pb.getLevel()+pb.getQualification()+pb.getSuitable()+pb.getType());
		 	 repositoryService.saveRepository("smoon", "SCENIC", "SCENICCNAME", "名称",
		 			 pb.getCname(), String.valueOf(pb.getCname().hashCode()));
		 	 if(StringUtils.isNotBlank(pb.getSummary())){
		 		repositoryService.saveRepository("smoon", "SCENIC", "SCENICSUMMARY", "简介",
			 			 pb.getSummary().replace("&nbsp;", "").substring(0,pb.getSummary().replace("&nbsp;", "").length()-1>8000?8000:pb.getSummary().replace("&nbsp;", "").length()-2), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getType())){
		 		repositoryService.saveRepository("smoon", "SCENIC", "SCENICTYPE", "类型",
			 			 pb.getType(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getQualification())){
		 		repositoryService.saveRepository("smoon", "SCENIC", "SCENICQUALIFICATION", "资质",
			 			 pb.getQualification(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getLevel())){
		 		repositoryService.saveRepository("smoon", "SCENIC", "SCENICLEVEL", "级别",
			 			 pb.getLevel(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getSuitable())){
		 		repositoryService.saveRepository("smoon", "SCENIC", "SCENICSUITABLE", "适合季节",
			 			 pb.getSuitable(), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 	if(StringUtils.isNotBlank(pb.getAttractions())){
		 		repositoryService.saveRepository("smoon", "SCENIC", "SCENICATTRACTIONS", "分景点",
			 			 pb.getAttractions().substring(0,pb.getAttractions().length()-2), String.valueOf(pb.getCname().hashCode()));
		 	 }
		 }
	}
	public static void initFlower() {
		
		 //initRiddle();    
		 ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		 RepositoryService repositoryService = context.getBean("repositoryService", RepositoryService.class);
		 // TODO Auto-generated method stub
		 //4.语义库中场景关键词  有逻辑 有词库	
	     InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("flowers.xls");
			
		 ExcelUtil eu = new ExcelUtil();
	     List<Object> ls =  eu.importDataFromExcel(new PlantBean(), in, "flowers.xls");
		int count = 1;
	     for(Object item : ls){
		 	   PlantBean pb = (PlantBean) item;
		 	   System.out.println("count="+(count++)+pb.getCname()+pb.getLaname()+pb.getNickname()+pb.getKingdom()+pb.getPhylum()
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
