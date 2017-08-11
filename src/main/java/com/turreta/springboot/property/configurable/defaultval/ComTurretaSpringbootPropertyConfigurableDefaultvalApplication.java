package com.turreta.springboot.property.configurable.defaultval;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComTurretaSpringbootPropertyConfigurableDefaultvalApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ComTurretaSpringbootPropertyConfigurableDefaultvalApplication.class, args);

		SomeLimitBean bean = context.getBean(SomeLimitBean.class);
		System.out.println("###################");
		System.out.println(bean.getSomeNumericLimit());
		System.out.println("###################");

	}
}
