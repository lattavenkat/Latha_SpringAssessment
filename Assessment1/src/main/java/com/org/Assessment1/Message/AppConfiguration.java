package com.org.Assessment1.Message;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.javadevsguide.springframework.di")
public class AppConfiguration {

	@Bean(name = "emailService")
	public MessageService emailService() {
		return new EmailService();
	}

	// @Bean(name="twitterService")
	// public MessageService twitterService(){
	// return new TwitterService();
	// }

	// @Bean(name="smsService")
	// public MessageService smsService(){
	// return new SMSService();
	// }

	@Bean
	public MessageProcessor messageProcessor() {
		return new MessageProcessorImpl(emailService());
	}
}
