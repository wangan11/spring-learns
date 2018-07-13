package com.wangan.spring.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author wangan on 2018/7/13
 * @description
 */
public class Car  implements InitializingBean,DisposableBean{

	public Car() {
		System.out.println("car constructor ..");
	}

	public void init1(){
		System.out.println("car init1 ..");
	}

	public void destory1(){
		System.out.println("car destory1 ..");
	}

	public void destroy() throws Exception {
		System.out.println("car destroy ..");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("car afterPropertiesSet ..");
	}

	@PostConstruct
	public void postConstruct(){
		System.out.println("car postConstruct...");
	}

	@PreDestroy
	public void preDestroy(){
		System.out.println("car preDestroy...");
	}
}
