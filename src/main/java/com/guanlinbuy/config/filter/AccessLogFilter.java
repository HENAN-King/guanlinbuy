package com.guanlinbuy.config.filter;

import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccessLogFilter implements Filter {

	private static final List<String> blackList = new ArrayList<String>();

	private static Logger logger = Logger.getLogger("record");
	public void init(FilterConfig filterConfig) throws ServletException {
		blackList.add("/favicon.ico");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		if (!blackList.contains(httpRequest.getRequestURI())) {
			logger.info("remote ip --> " + httpRequest.getRemoteAddr());
		}
		chain.doFilter(httpRequest, httpResponse);
	}

	public void destroy() {

	}
}
