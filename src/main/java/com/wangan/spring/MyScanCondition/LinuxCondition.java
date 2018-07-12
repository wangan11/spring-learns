package com.wangan.spring.MyScanCondition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author wangan on 2018/7/12
 * @description
 */
public class LinuxCondition implements Condition {
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		Environment environment = context.getEnvironment();
		String property = environment.getProperty("os.name");
		if(property.toLowerCase().contains("linux")){
			return true;
		}
		return false;
	}
}
