package edu.zut.cs.javaee.epms.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.epms.admin.dao.UserDao;
import edu.zut.cs.javaee.epms.admin.domain.User;
import edu.zut.cs.javaee.epms.admin.service.UserManager;
import edu.zut.cs.javaee.epms.base.service.impl.GenericManagerImpl;

@Component
public class UserManagerImpl extends GenericManagerImpl<User, Long> implements UserManager {

	UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
		this.dao = this.userDao;
	}

	@Override
	public User findbyUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
 
}
