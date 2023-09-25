package my.manu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import my.manu.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>
{
	
}
