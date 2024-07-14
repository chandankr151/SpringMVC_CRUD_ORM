package com.springmvc.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.Entities.User;

@Repository
public class UserDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveUser(User user) {
		int i = (int) hibernateTemplate.save(user);
		return i;
	}

	public List<User> displayUsers() {
		List<User> allUser = hibernateTemplate.loadAll(User.class);
		return allUser;
	}

	@Transactional
	public User deleteUser(int id) {
		
		User user = hibernateTemplate.get(User.class, id);
		hibernateTemplate.delete(user);
		System.out.println(user);
		return user;
	}
}
