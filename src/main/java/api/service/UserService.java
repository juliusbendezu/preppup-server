package api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import api.exceptions.UserNotFoundException;
import api.models.User;
import api.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> getAll() {
		return userRepository.findAll();
	}

	public User getUser(String username) {
		Optional<User> user = userRepository.findById(username);
		if (!user.isPresent())
			throw new UserNotFoundException();

		return user.get();

	}
}
