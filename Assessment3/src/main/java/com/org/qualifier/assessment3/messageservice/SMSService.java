package com.org.qualifier.assessment3.messageservice;

public class SMSService implements MessageService{

	public void sendMsg(String message) {
		System.out.println("SMS Message: " + message);
	}

}
