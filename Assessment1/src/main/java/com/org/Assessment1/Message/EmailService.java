package com.org.Assessment1.Message;

public class EmailService implements MessageService{

	public void sendMsg(String message) {
		System.out.println("Email: " + message);
	}

}
