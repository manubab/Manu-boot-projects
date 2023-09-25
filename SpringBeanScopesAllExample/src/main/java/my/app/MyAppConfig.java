package my.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("my.app")
public class MyAppConfig {
	
	@Bean
	@Scope("prototype")
	public MyRepository getRepo1() {
		return new MyRepository();
	}
	
	@Bean("get01")
	@Scope("prototype")

	public MyRepository getRepo2() {
		return new MyRepository();
	}

}
