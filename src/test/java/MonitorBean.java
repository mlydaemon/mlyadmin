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
public class MonitorBean {
	private String title;//检索
	private String reply;//应答
	public MonitorBean(){
		
	}
	public MonitorBean(String title,String reply){
		this.title=title;
		this.reply=reply;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	
}
