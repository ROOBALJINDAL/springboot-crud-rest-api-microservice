package com.testing.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	String getDefaultMessage(){
		return userService.getRootTemplate();
	}
	

	@RequestMapping("/getUsers")
	List<User> getUsers(){
		return userService.getAllUsers();
	}

	@RequestMapping(method= RequestMethod.POST, value="/saveUser")
	void saveUser(@RequestBody User user){
		userService.saveUser(user);
	}
	
	@RequestMapping(method= RequestMethod.POST, value="/updateUser")
	void updateUser(@RequestBody User user){
		userService.saveUser(user);
	}
	
	@RequestMapping(method= RequestMethod.POST, value="/deleteUser")
	void saveUser(@RequestParam int id){
		userService.deleteUser(id);
	}
	
	
	
}
