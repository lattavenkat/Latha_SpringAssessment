package com.org.Assessment1;

import com.org.Assessment1.Message.AppConfiguration;
import com.org.Assessment1.Message.MessageProcessor;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class Assessment1Application {

	public static void main(String[] args) {
		// SpringApplication.run(Assessment1Application.class, args);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		MessageProcessor userService = applicationContext.getBean(MessageProcessor.class);
		userService.processMsg("latha@gmail.com");

	}
}
