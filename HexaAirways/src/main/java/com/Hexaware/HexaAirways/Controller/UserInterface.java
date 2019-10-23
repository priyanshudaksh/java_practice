package com.Hexaware.HexaAirways.Controller;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.Hexaware.HexaAirways.Pojo.User;
public interface UserInterface extends CrudRepository<User, Integer>{

		@Query(value="select* from user_details where email = ?1 and password = ?2 " , nativeQuery=true) 
		User finduser(String email, String password);
	
}
