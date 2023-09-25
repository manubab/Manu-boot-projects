package my.manu.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order
public class DataSurceRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("DataSource Runner");
	}

}
