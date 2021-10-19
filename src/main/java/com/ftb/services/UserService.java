package com.ftb.services;

import java.util.List;
import java.util.Optional;

import com.ftb.entities.User;

public interface UserService {
	public void addNewUser(User user);
	public User updateUser(User user);
	public void deleteUser(User user);
	public List<User> findAllUsers();
	public Optional<User> findUserById(int id);
}
