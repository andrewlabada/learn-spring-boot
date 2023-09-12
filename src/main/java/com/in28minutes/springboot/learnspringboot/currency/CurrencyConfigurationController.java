package com.in28minutes.springboot.learnspringboot.currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
	
	private final CurrencyServiceConfiguration configuration;
	
	@Autowired
	public CurrencyConfigurationController(CurrencyServiceConfiguration configuration) {
		this.configuration = configuration;
	}

	@RequestMapping("/api/v1/currency-configuration")
	public CurrencyServiceConfiguration retreiveCurrency() {
		return configuration;
	}
	
}
