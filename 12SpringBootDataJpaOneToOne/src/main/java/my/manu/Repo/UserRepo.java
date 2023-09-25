package my.manu.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import my.manu.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>
{
	

}
