package com.wangan.spring.config;

import com.wangan.spring.controller.MyController;
import com.wangan.spring.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author wangan on 2018/7/12
 * @description
 */
@Configuration
@Import({MyController.class, MyService.class})
public class MyConfig1 {

	@Bean
	public MyFactoryBean myFactoryBean(){
		return new MyFactoryBean();
	}
}
