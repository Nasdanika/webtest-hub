package org.nasdanika.webtest.hub.app;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import waffle.servlet.NegotiateSecurityFilter;

public class SecurityFilter extends NegotiateSecurityFilter implements Filter {

	/**
	 * If authorization is "Bearer" - pass down, otherwise use super-logic.
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		if (request instanceof HttpServletRequest) {
			String authorization = ((HttpServletRequest) request).getHeader("Authorization");
			if (authorization!=null && authorization.startsWith("Bearer ")) {
				chain.doFilter(request, response);
			} else {
				super.doFilter(request, response, chain);					
			}
		} else {
			super.doFilter(request, response, chain);
		}
	}

}
