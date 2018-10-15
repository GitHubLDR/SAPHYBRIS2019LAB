package com.uhire.util;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Demo {
	
	private List theList;
	private Set theSet;
	private Map theMap;
	private Properties theProperties;

	public Map getTheMap() {
		return theMap;
	}

	public void setTheMap(Map theMap) {
		this.theMap = theMap;
	}

	public List getTheList() {
		return theList;
	}

	public void setTheList(List theList) {
		this.theList = theList;
	}

	public void show() {
		System.out.println("List:"+theList);
		System.out.println("Set:"+theSet);
		System.out.println("Map:"+theMap);
		System.out.println("Properties:"+theProperties);
		
	}

	public Set getTheSet() {
		return theSet;
	}

	public void setTheSet(Set theSet) {
		this.theSet = theSet;
	}

	public Properties getTheProperties() {
		return theProperties;
	}

	public void setTheProperties(Properties theProperties) {
		this.theProperties = theProperties;
	}


	
	
	

}
