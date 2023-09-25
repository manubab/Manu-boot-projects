package my.manu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import my.manu.entity.User;
import my.manu.repo.UserRepo;

@Service
public class UserService
{
	@Autowired
	private UserRepo repo;
	
	
	public Integer saveUser(User user)
	{
		return repo.save(user).getUserId();
	}
	
	@Cacheable(value="users",key="#userId")
	public User getOneUser(Integer userId)
	{
		return repo.findById(userId).get();
	}
	
	
	@CachePut(value="users",key="#userId")
	public void updateUser(Integer userId,User user)
	{
		User userDb=repo.findById(userId).get();
		userDb.setName(user.getName());
		userDb.setRole(user.getRole());
		repo.save(userDb);
	}
	
	@CacheEvict(value = "users",allEntries =true)
	public void deleteUser(Integer userId)
	{
		repo.deleteById(userId);
	}

}
