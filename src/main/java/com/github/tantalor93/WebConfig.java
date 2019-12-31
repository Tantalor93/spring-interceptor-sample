package com.github.tantalor93;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Autowired
	private BenkyInterceptor benkyInterceptor;

	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new Sample3Filter());
		filterRegistrationBean.addUrlPatterns("/benky");
		return filterRegistrationBean;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		InterceptorRegistration interceptorRegistration = registry.addInterceptor(benkyInterceptor);
		interceptorRegistration.addPathPatterns("/sample");
	}
}
