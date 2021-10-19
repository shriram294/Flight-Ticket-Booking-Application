package com.ftb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ftb.dao.UserRepository;
import com.ftb.entities.User;
import com.ftb.exceptions.RecordNotFoundException;
@Repository
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void addNewUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		Optional<User> user1 = userRepository.findById(user.getUserId());
		if(user1.isPresent()) {
			User user2 = userRepository.getById(user.getUserId());
			user2.setUserName(user.getUserName());
			return userRepository.save(user2);
		}else {
			throw new RecordNotFoundException("Details not found for given id");
		}
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		userRepository.deleteById(user.getUserId());
		
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Optional<User> findUserById(int id) {
		// TODO Auto-generated method stub
		Optional<User> user3 = userRepository.findById(id);
		if(user3.isPresent()) {
			return user3;
		}else {
			throw new RecordNotFoundException("Details not found for given id");
		}
	}

}
