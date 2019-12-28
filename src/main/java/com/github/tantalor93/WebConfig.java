package com.github.tantalor93;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new Sample3Filter());
		filterRegistrationBean.addUrlPatterns("/benky");
		return filterRegistrationBean;
	}
}
