package my.manu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import my.manu.dbCon.MyDbConnection;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private MyDbConnection con;
	
	public void run(String... args) throws Exception {
		System.out.println(con);
	}
}
