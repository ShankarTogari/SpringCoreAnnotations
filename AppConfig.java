package com.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Foo foo() {
		return new Foo();

	}

	@Bean
	public Bar bar() {
		return new Bar();

	}
	
	@Bean
	public TransferService transferService() {
	return new TransferServiceImpl();
	}


}
