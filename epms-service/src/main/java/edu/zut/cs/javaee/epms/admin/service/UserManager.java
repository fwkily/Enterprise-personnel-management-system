package edu.zut.cs.javaee.epms.admin.service;

import java.util.List;

import edu.zut.cs.javaee.epms.admin.domain.User;
import edu.zut.cs.javaee.epms.base.service.GenericManager;
/**
 * User service
 * @author lsz
 */
public interface UserManager extends GenericManager<User, Long> {
	/**
	 * 
	 * Check All Users 
	 * Check the User by the user's username
	 * @param username User username 
	 * @return
	 */
	List<User> findAll();

	User findbyUsername(String username);
}
