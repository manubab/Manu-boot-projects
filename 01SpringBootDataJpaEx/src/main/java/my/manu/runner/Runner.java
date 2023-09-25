package my.manu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import my.manu.enties.Student;
import my.manu.repo.StudentRepo;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	StudentRepo repo;

	public void run(String... args) throws Exception {
//		Student s1 = new Student();

//		s1.setSId("M121");
//		s1.setSName("Madhan");
//		s1.setSBranch("CSE");

		Student s2 = new Student();

		s2.setSId("M121");
		s2.setSName("Arun");
		s2.setSBranch("CSE");

//		repo.save(s1);
		repo.save(s2);
		
		System.out.println(repo.getClass().getName());

	}

}
