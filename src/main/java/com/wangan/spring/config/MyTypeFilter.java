package com.wangan.spring.config;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author wangan on 2018/7/12
 * @description
 */
public class MyTypeFilter implements TypeFilter {
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		if(classMetadata.getClassName().contains("Controller")){
			return true;
		}
		return false;
	}
}
