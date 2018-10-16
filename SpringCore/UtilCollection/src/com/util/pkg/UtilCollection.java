package com.util.pkg;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UtilCollection {

	private List l;
	private Set s;
	private Map m;
	private Properties p;
	public List getL() {
		return l;
	}
	public void setL(List l) {
		this.l = l;
	}
	public Set getS() {
		return s;
	}
	public void setS(Set s) {
		this.s = s;
	}
	public Map getM() {
		return m;
	}
	public void setM(Map m) {
		this.m = m;
	}
	public Properties getP() {
		return p;
	}
	public void setP(Properties p) {
		this.p = p;
	}
	
	
	public void show()
	{
		System.out.println(l);
		System.out.println(s);
		System.out.println(m);
		System.out.println(p);
	}
	
	
	
	
}
