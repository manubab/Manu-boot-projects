package my.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages="my.*")
@PropertySource("classpath:myapp.properties")
public class MyConfig {

}
