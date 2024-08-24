package com.seleniumexpress.lc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class LCAppEmailServiceImpl implements LCAppEmailService {
	
	@Autowired
	private JavaMailSender javaMailSenderImpl;

	@Override
	public void sendEmail(String userName, String userEmail, String result) {
		
		SimpleMailMessage newEmail = new SimpleMailMessage();
		newEmail.setTo(userEmail);
		newEmail.setSubject("Love Caluclator Application Result");
		newEmail.setText("Hi " + userName + ", The result predicted by the LCApp is: " + result);
		
		javaMailSenderImpl.send(newEmail);
		
	}

}
