package com.springmvc.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.DAO.UserDAO;
import com.springmvc.Entities.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDao;
	
	@Override
	public int saveUser(User user) {
		
		int saveUser = userDao.saveUser(user);
		return saveUser;
	}

	@Override
	public List<User> displayUsers() {
		
		List<User> allUser = userDao.displayUsers();
		return allUser;
	}

	@Override
	public User deleteUser(int id) {
		
		return userDao.deleteUser(id);
		
	}
}
