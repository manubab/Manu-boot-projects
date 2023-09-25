package my.manu.runner;

import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import my.manu.Repo.RoleRepo;
import my.manu.Repo.UserRepo;
import my.manu.entities.Role;
import my.manu.entities.User;


@Component
public class TestObjDataInsertRunner implements CommandLineRunner
{
	
	@Autowired
	private RoleRepo rrepo;
	
	@Autowired
	private UserRepo repo;
	
	public void run(String ...args) throws Exception
	{
		
		Role r1 = new Role(503, "ADMIN");
		Role r2 = new Role(504, "GUEST");
		
		
		rrepo.save(r1);
		rrepo.save(r2);
		
		
		User u1 = new User(10, "SYED", r1);
		User u2 = new User(11, "SAM", r2);
		
		
		repo.save(u1);
		repo.save(u2);
		
	}
	
	
	

}
