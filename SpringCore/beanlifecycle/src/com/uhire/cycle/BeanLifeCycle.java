package com.uhire.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanLifeCycle implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

	
	@Override
public void destroy() throws Exception
{
	System.out.println("DisposableBean:: destroy()");
}

	@Override
public void afterPropertiesSet() throws Exception
{
	System.out.println("InitializingBean:: afterPropertiesSet()");
}

	@Override
public void setApplicationContext(ApplicationContext arg0 ) throws BeansException
{
	System.out.println("ApplicationContextAware:: setApplicationContext("+arg0+")");
	
}
	@Override
public void setBeanFactory(BeanFactory arg0) throws BeansException
{
	System.out.println("BeanFactorAware:: setBeanFactory("+arg0+")");
}
	@Override
public void setBeanName(String arg0)
{
	System.out.println("BeanNameAware::	setBeanName("+arg0+")");
}
public void setUp()
{
	System.out.println("calling custom setUp() method");
}

public void destory()
{
	System.out.println("calling custom destory() method");
}


}
