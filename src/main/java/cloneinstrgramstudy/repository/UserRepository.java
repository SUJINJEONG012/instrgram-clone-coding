package cloneinstrgramstudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cloneinstrgramstudy.domain.User;


public interface UserRepository extends JpaRepository<User, Integer>{
	
	// select * from user where username= 1?
	User findByUsername(String username);
}
