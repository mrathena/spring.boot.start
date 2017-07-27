package com.mrathena.spring.boot.start.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.mxab.thymeleaf.extras.dataattribute.dialect.DataAttributeDialect;

@Configuration
public class Thymeleaf {

	// thymeleaf-extras-data-attribute, 给Thymeleaf添加Dialect(DataAttributeDialect)
	// data:foo="${'bar'}"会转换成data-foo="bar", 否则需要th:attr="data-foo=${'bar'}"
	@Bean
	public DataAttributeDialect getDataAttributeDialect() {
		return new DataAttributeDialect();
	}

}