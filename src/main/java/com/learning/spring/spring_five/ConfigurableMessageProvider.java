package com.learning.spring.spring_five;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.spring.spring_five._interface.MessageProvider;

@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider {

	private String message;
	
	/*@Autowired
	public ConfigurableMessageProvider(@Value("Configurable Message") String message) {
		this.message = message;
	}*/
	
	@Autowired
	public ConfigurableMessageProvider(String message) {
		this.message = message;
	}
	
	
	
	public String getMessage() {
		return this.message;
	}

}
