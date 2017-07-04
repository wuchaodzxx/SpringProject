package com.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {
	@Bean(name = "dog")
	@Description("Provides a basic example of a bean")
	@Scope("prototype") //����prototypeע���Bean��ÿ�ζԸ�Bean�ĵ��ö�����һ���µ�bean,��singletonע���Bean��Ioc�Ṳ��ͬһ��Bean
	public Dog dog() {
		return new Dog();
	}
}
