package org.jsp.mailsendingapi.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class EmailConfiguration {
	private String email;
	private String subject;
	private String text;
}
