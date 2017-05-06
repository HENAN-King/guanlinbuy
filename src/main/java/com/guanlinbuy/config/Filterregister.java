package com.guanlinbuy.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.guanlinbuy.config.filter.AccessLogFilter;

@Configuration
public class Filterregister {

	@Bean
	public FilterRegistrationBean FilterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		AccessLogFilter accessLogFilter = new AccessLogFilter();
		filterRegistrationBean.addUrlPatterns("/*");
		filterRegistrationBean.setFilter(accessLogFilter);
		return filterRegistrationBean;
	}
}
