package com.wangan.spring.config;

import com.wangan.spring.MyScanCondition.LinuxCondition;
import com.wangan.spring.MyScanCondition.WindowCondition;
import com.wangan.spring.controller.MyController;
import com.wangan.spring.dao.MyDao;
import com.wangan.spring.entity.User;
import com.wangan.spring.service.MyService;
import org.springframework.context.annotation.*;

/**
 * @author wangan on 2018/7/12
 * @description
 */
@Configuration
@ComponentScan(basePackages = {"com.wangan.spring"},useDefaultFilters = false
,excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {MyController.class, MyDao.class})}
,includeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = MyService.class), @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})}
)
@Conditional({WindowCondition.class})
public class MyConfig {

	@Scope("prototype")
	@Bean("user")
	@Lazy
	@Conditional({LinuxCondition.class})
	public User getUser(){
		System.out.println("初始化bean....");
		return new User();
	}

}
