

public class IdiomBean {
	private String cname;//成语名称
	private String spell;//拼音
	private String jspell;//简拼
	private String synonyms;//近义词
	private String antonym;//反义词
	private String explain;//解释
	private String provenance;//出处
	private String examples;//例子
	private String dialect ;//歇后语
	private String riddle ;//谜语
	private String story ;//成语故事
	public IdiomBean(){
		
	}
    public IdiomBean(String cname,String spell,String jspell,String synonyms,String antonym,String explain,
    		String provenance,String examples,String dialect,String riddle,String story){
    	this.cname = cname;//成语名称
    	this.spell = spell;//拼音
    	this.jspell = jspell;//简拼
    	this.synonyms = synonyms;//近义词
    	this.antonym = antonym;//同义词
    	this.explain = explain;//解释
    	this.provenance= provenance;//出处
    	this.examples = examples;//例子
    	this.dialect = dialect;//歇后语
    	this.riddle = riddle;//谜语
    	this.story = story;//成语故事
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getSpell() {
		return spell;
	}
	public void setSpell(String spell) {
		this.spell = spell;
	}
	public String getJspell() {
		return jspell;
	}
	public void setJspell(String jspell) {
		this.jspell = jspell;
	}
	public String getSynonyms() {
		return synonyms;
	}
	public void setSynonyms(String synonyms) {
		this.synonyms = synonyms;
	}
	public String getAntonym() {
		return antonym;
	}
	public void setAntonym(String antonym) {
		this.antonym = antonym;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	public String getProvenance() {
		return provenance;
	}
	public void setProvenance(String provenance) {
		this.provenance = provenance;
	}
	public String getExamples() {
		return examples;
	}
	public void setExamples(String examples) {
		this.examples = examples;
	}
	public String getDialect() {
		return dialect;
	}
	public void setDialect(String dialect) {
		this.dialect = dialect;
	}
	public String getRiddle() {
		return riddle;
	}
	public void setRiddle(String riddle) {
		this.riddle = riddle;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
    
    
}
