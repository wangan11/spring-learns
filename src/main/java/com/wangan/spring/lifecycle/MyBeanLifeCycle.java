package com.wangan.spring.lifecycle;

import com.wangan.spring.entity.Car;
import com.wangan.spring.entity.Cat;
import com.wangan.spring.entity.MyBeanPostProcessor;
import com.wangan.spring.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author wangan on 2018/7/13
 * @description
 */
 @Configuration
 @Import({MyBeanPostProcessor.class})
public class MyBeanLifeCycle {

	@Bean(initMethod="init1",destroyMethod = "destory1")
	public Car user(){
		return new Car();
	}

}
