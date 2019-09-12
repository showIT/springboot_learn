package com.learn.springbootlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;


@ServletComponentScan
@ComponentScan(basePackages = { "com.learn.springbootlearn" })
@SpringBootApplication
public class SpringbootLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLearnApplication.class, args);
	}

}
