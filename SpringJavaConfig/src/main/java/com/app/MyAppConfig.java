package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:jdbc.propertices")
public class MyAppConfig
{
	@Autowired
	Environment env;
	@Bean
	public DriverManager conObj()
	{
		DriverManager dm=new DriverManager();
		dm.setDriverClass(env.getProperty("driver"));
		dm.setDriverUrl(env.getProperty("url"));
		
		return dm;
	}

}
