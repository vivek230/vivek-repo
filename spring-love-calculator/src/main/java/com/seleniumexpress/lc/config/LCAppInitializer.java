package com.seleniumexpress.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Loading LoveCalculatorAppConfig........");
		Class[] servletConfigClasses = {LoveCalculatorAppConfig.class};
		return servletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		String[] servletMappings = { "/" };
		return servletMappings;
	}

}
