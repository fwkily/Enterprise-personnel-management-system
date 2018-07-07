package edu.zut.cs.javaee.epms.admin.dao;

import edu.zut.cs.javaee.epms.admin.domain.User;
import edu.zut.cs.javaee.epms.base.dao.GenericDao;
/*
 * Create UserDao
 */
public interface UserDao extends GenericDao<User, Long> {
	User findByUsername (String username);
}
