/**   
* @Title: ScenicBean.java 
* @Package com.mlycan.crawler.engine 
* @Description: TODO(用一句话描述该文件做什么) 
* @author mlycan  yuwei   
* @date 2017年8月24日 下午1:14:47 
* @version V1.0   
*/


/** 
* @ClassName: ScenicBean 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author mlycan  yuwei  
* @date 2017年8月24日 下午1:14:47 
*  
*/
public class ScenicBean {
	private String cname;//景区名称
	private String summary;//景区简介
	private String type;//景区类型
	private String qualification;//景区资质
	private String level;//景区级别
	private String suitable;//适合季节
	private String attractions;//分景点
	public ScenicBean(){
		
	}
	public ScenicBean(String cname,String summary,String type,String qualification,String level,String suitable,String attractions){
		this.cname= cname;
		this.summary= summary;
		this.type=type;
		this.qualification=qualification;
		this.level=level;
		this.suitable=suitable;
		this.attractions=attractions;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getSuitable() {
		return suitable;
	}
	public void setSuitable(String suitable) {
		this.suitable = suitable;
	}
	public String getAttractions() {
		return attractions;
	}
	public void setAttractions(String attractions) {
		this.attractions = attractions;
	}
	
}
