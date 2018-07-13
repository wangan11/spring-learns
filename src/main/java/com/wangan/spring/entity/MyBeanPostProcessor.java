package com.wangan.spring.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wangan on 2018/7/13
 * @description
 */

public class MyBeanPostProcessor implements BeanPostProcessor{
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+"==>"+"postProcessBeforeInitialization");
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+"==>"+"postProcessAfterInitialization");
		return bean;
	}
}
