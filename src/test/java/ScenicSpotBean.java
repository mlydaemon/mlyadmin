

public class ScenicSpotBean {
	private String cname;//景点名称
	private String scenic;//景区
	private String summary;//景点简介
	public ScenicSpotBean(){
		
	}
    public ScenicSpotBean(String cname,String summary,String scenic){
		this.cname= cname;
		this.summary= summary;
		this.scenic= scenic;
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
	public String getScenic() {
		return scenic;
	}
	public void setScenic(String scenic) {
		this.scenic = scenic;
	}
	
}
