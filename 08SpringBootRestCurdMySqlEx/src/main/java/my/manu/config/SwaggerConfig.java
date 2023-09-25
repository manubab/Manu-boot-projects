package my.manu.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
//@EnableSwagger2
public class SwaggerConfig
{
	@Bean
	public Docket createDocket()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.basePackage("my.manu.*"))
				.paths(PathSelectors.any())
				.build() 
				.pathMapping("/")
				.apiInfo(apiInfo());
	}
	
	@Bean
	public ApiInfo apiInfo()
	{
		return new ApiInfo("Student app","Sample App","3.2GA","http://sample.com",new Contact("Manu","http://github.com/manubab","java@gmail.com"),
				"apache","http://apache.com",
				Collections.emptyList());
	}
	
	

}
