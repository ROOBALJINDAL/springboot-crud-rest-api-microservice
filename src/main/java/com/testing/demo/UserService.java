package com.testing.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository repo;
	
	@Autowired
	private UserCrudRepo userCrudRepo;
	
	String getRootTemplate(){
		return "<b><h3><font color=\"red\">Hey Roobal, Your Spring Boot application is up..</font></h3>"
				+ "<font face=\"verdana\" color=\"blue\">Following are the supported rest API calls for CRUD operations: </b></font><br>"
				+ "<font face=\"verdana\" color=\"green\">"
				+ "1) <a href=\"http://localhost:8888/getUsers\">http://localhost:8888/getUsers</a><br>"
				+ "2) http://localhost:8888/saveUser<br>"
				+ "3) http://localhost:8888/updateUser<br>"
				+ "4) http://localhost:8888/deleteUser<br></font>";
	}
	
	List<User> getAllUsers(){
		return repo.findAll();
	}
	
	void saveUser(User user){
		repo.save(user);
	}

	public void deleteUser(int id) {
		User user = new User();
		user.setId(id);
		repo.delete(user);
		
	}
}
