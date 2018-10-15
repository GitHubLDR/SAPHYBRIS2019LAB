package com.uhire.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor{
	

	public Object postprocessAfterInitialization(Object bean, String beanName) throws BeansException
	{
		System.out.println("BeanPostProcessor:: postProcessAfterInitialization("+bean+" , "+beanName+") ");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor:: postProcessBeforeInitialization("+bean+" , "+beanName+"");
		return bean;
	}

}

	
	
	
	
