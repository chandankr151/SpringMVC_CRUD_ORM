package com.springmvc.Service;

import java.util.List;

import com.springmvc.Entities.User;

public interface UserService {

	public int saveUser(User user);
	
	public List<User> displayUsers();
	
	public User deleteUser(int id);
}
