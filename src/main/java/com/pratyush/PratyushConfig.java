package com.pratyush;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.pratyush"})
public class PratyushConfig {
	
	@Bean
public InternalResourceViewResolver viewResolver()
{
	InternalResourceViewResolver vr = new InternalResourceViewResolver();
	vr.setPrefix("/WEB-INF/");
	vr.setSuffix(".jsp");
	return vr;
	
}
}
//to run our setup without web.xml and servletName-servlet.xml
//we can use PratyushConfig and MyWebInitializer
//this is for dispatcher servlet