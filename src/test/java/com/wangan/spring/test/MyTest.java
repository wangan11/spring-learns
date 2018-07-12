package com.wangan.spring.test;

import com.wangan.spring.config.MyConfig;
import com.wangan.spring.config.MyConfig1;
import com.wangan.spring.config.MyFactoryBean;
import com.wangan.spring.entity.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @author wangan on 2018/7/12
 * @description
 */
public class MyTest {

	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

	@Test
	public void test() {
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		Map<String, Object> systemProperties = environment.getSystemProperties();
		System.out.println(systemProperties);
		System.out.println("--------------------");
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanName :
				beanDefinitionNames) {
			System.out.println(beanName);
		}
//		User bean = applicationContext.getBean(User.class);
//		User bean1 = applicationContext.getBean(User.class);
	}

	@Test
	public void test1(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig1.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanName :
				beanDefinitionNames) {
			System.out.println(beanName);
		}
		Object myFactoryBean = applicationContext.getBean("myFactoryBean");
		Object myFactoryBean1 = applicationContext.getBean("myFactoryBean");
		System.out.println("bean="+myFactoryBean);
		System.out.println("bean1="+myFactoryBean1);
		Object bean2= applicationContext.getBean("&myFactoryBean");
		System.out.println(bean2);

	}

}
