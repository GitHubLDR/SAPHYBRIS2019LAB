package newutil;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Demo {

	private List thelist;
	private Set theset;
	private Map themap;
	private Properties prop;
	public List getThelist() {
		return thelist;
	}
	public void setThelist(List thelist) {
		this.thelist = thelist;
	}
	public Set getTheset() {
		return theset;
	}
	public void setTheset(Set theset) {
		this.theset = theset;
	}
	public Map getThemap() {
		return themap;
	}
	public void setThemap(Map themap) {
		this.themap = themap;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
 public void show(){
	 System.out.println("list:"+thelist);
	 System.out.println("set:"+theset);
	 System.out.println("map:"+themap);
	 System.out.println("properties:"+prop);
	 
	 
 }









}
