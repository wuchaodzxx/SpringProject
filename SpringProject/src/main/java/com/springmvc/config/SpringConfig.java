package com.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {
	@Bean(name = "dog")
	@Description("Provides a basic example of a bean")
	@Scope("prototype") //对于prototype注解的Bean，每次对该Bean的调用都创建一个新的bean,而singleton注解的Bean，Ioc会共享同一个Bean
	public Dog dog() {
		return new Dog();
	}
}
