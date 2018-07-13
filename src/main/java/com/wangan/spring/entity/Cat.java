package com.wangan.spring.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author wangan on 2018/7/13
 * @description
 */
public class Cat implements InitializingBean,DisposableBean {
	public void destroy() throws Exception {
		System.out.println("cat destroy...");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("cat afterPropertiesSet...");
	}
}
