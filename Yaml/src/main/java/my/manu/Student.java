package my.manu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@Data
@ConfigurationProperties("my.app")
public class Student 
{
	
//	@Value("${my.app.name}")
	public String name;
}
