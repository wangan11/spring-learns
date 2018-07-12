package com.wangan.spring.config;

import com.wangan.spring.entity.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author wangan on 2018/7/12
 * @description
 */
public class MyFactoryBean implements FactoryBean<Person> {
	public Person getObject() throws Exception {
		return new Person();
	}

	public Class<?> getObjectType() {
		return Person.class;
	}

	public boolean isSingleton() {
		return false;
	}
}
