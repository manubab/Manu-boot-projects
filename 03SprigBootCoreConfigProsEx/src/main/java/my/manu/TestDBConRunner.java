package my.manu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component

public class TestDBConRunner implements CommandLineRunner {

	@Autowired
	private DataBaseCon cob;
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(cob);

	}

}
