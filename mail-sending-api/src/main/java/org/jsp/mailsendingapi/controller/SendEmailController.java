package org.jsp.mailsendingapi.controller;

import org.jsp.mailsendingapi.dto.EmailConfiguration;
import org.jsp.mailsendingapi.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendEmailController {
	@Autowired
	private SendEmailService emailService;
	@Autowired
	private EmailConfiguration configuration;

	@PostMapping("/sendmail")
	public String sendEmail(String emailId) {
		configuration.setEmail(emailId);
		configuration.setSubject("Testing java mail sender");
		configuration.setText("We are sending this mail to test our mail sending API");
		return emailService.sendEmail(configuration);
	}
}
