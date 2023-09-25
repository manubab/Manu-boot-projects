package my.manu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestObjRunner implements CommandLineRunner 
{
	@Autowired
	private DataBaseBean dob;

	@Override
	public void run(String... args) throws Exception {
      
		System.out.println(dob);

	}

}
