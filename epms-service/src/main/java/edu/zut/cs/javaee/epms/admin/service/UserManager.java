package edu.zut.cs.javaee.epms.admin.service;

import java.util.List;

import edu.zut.cs.javaee.epms.admin.domain.User;
import edu.zut.cs.javaee.epms.base.service.GenericManager;

public interface UserManager extends GenericManager<User, Long> {

	List<User> findAll();

	User findbyUsername(String username);
}
