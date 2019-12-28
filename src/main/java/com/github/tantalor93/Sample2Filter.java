package com.github.tantalor93;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
@Order(2)
public class Sample2Filter extends OncePerRequestFilter {

	private static final Logger LOGGER = LoggerFactory.getLogger(Sample2Filter.class);

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
			FilterChain filterChain) throws ServletException, IOException {
		LOGGER.info("handling request to '{}'", request.getServletPath());

		filterChain.doFilter(request, response);
	}
}
