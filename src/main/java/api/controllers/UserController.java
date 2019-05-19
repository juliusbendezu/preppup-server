package api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import api.exceptions.UserNotFoundException;
import api.models.User;
import api.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/all")
	public List<User> getAll(){
		return userService.getAll();
	}
	
	@GetMapping("/{username}")
	public User getUser(String username) {
		User u = userService.getUser(username);
		if(u == null)
			throw new UserNotFoundException();
		return u;
	}

}
