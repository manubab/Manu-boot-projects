package my.manu.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(50)
public class EmailConfigRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("EmailConfigRunner");
	}

}
