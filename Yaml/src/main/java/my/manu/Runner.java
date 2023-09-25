package my.manu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Runner implements CommandLineRunner {

	@Autowired
	Student s1;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(s1);

	}

}
