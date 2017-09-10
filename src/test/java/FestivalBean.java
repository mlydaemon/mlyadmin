/**   
* @Title: FestivalBean.java 
* @Package com.mlycan.crawler.engine 
* @Description: TODO(用一句话描述该文件做什么) 
* @author mlycan  yuwei   
* @date 2017年9月5日 上午9:16:14 
* @version V1.0   
*/


/** 
* @ClassName: FestivalBean 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author mlycan  yuwei  
* @date 2017年9月5日 上午9:16:14 
*  
*/
public class FestivalBean {
	private String cname;//节日名称
	private String type;//地区
	private String dates;//节日日期
	private String summary;//简介
	private String origin;//由来
	
	private String custom;//习俗
	private String legend;//传说
	private String holiday;//放假安排
	public FestivalBean(){
		
	}
	public FestivalBean(String cname,String type,String dates,String summary,String origin,String custom,String legend,String holiday){
		this.cname=cname;
		this.type=type;
		this.dates= dates;
		this.summary = summary;
		this.origin = origin;
		this.custom = custom;
		this.legend = legend;
		this.holiday = holiday;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getCustom() {
		return custom;
	}
	public void setCustom(String custom) {
		this.custom = custom;
	}
	public String getLegend() {
		return legend;
	}
	public void setLegend(String legend) {
		this.legend = legend;
	}
	public String getHoliday() {
		return holiday;
	}
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
	
	
}
