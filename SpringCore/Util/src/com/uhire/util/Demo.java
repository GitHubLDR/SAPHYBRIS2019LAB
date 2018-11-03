package com.uhire.util;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Demo {
	
 	@SuppressWarnings("rawtypes")
	private List theList;
	@SuppressWarnings("rawtypes")
	private Set theSet;
	@SuppressWarnings({ "rawtypes" })
	private Map theMap;
	private Properties theProperties;
	
	
 	
	 
	
	@SuppressWarnings("rawtypes")
	public List getTheList()
	{
		return theList;
	}
	
	@SuppressWarnings("rawtypes")
	public void setTheList(List theList)
	{
		this.theList = theList;
	}
	
	@SuppressWarnings("rawtypes")
	public Set gettheSet()
	{
		return theSet;
	}
	
	@SuppressWarnings("rawtypes")
	public void setTheSet(Set theSet)
	{
		this.theSet = theSet;
	}
	
	@SuppressWarnings("rawtypes")
	public Map getTheMap()
	{
		return theMap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setTheMap(Map theMap)
	{
		this.theMap = theMap;
	}
	
	public Properties getTheProperties()
	{
		return theProperties;
	}
	
	public void setTheProperties(Properties theProperties)
	{
		this.theProperties = theProperties;
	}
	public void show()
	{
		System.out.println("List:"+theList);
		System.out.println("Set:"+theSet); 
		System.out.println("Map:"+theMap);
		System.out.println("Properties:"+theProperties);
	}}

