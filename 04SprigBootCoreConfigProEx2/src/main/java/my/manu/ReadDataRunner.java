package my.manu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReadDataRunner implements CommandLineRunner {

	@Autowired
	private MyServiceData mob;
	
	public void run(String... args) throws Exception {

		System.out.println(mob);
	}

}
