package com.coursecube.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ProjWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{ProjWebConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{ProjWebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
	
}
