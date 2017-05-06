package com.guanlinbuy.config.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AccessLogFilter implements Filter {

	private static final List<String> blackList = new ArrayList<String>();

	public void init(FilterConfig filterConfig) throws ServletException {
		blackList.add("/favicon.ico");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		if (!blackList.contains(httpRequest.getRequestURI())) {
			System.err.println(httpRequest.getRemoteAddr());
		}
		chain.doFilter(httpRequest, httpResponse);
	}

	public void destroy() {

	}
}
