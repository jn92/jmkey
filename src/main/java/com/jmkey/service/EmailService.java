package com.jmkey.service;

import com.jmkey.dto.Email;

public interface EmailService {

	public void sentEmail(Email email);
	
	public Email buildEmail(String motivo, String Texto, String base64);
	
}
