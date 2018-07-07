package edu.zut.cs.javaee.epms.admin.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.epms.admin.dao.RoleDao;
import edu.zut.cs.javaee.epms.admin.domain.Role;
import edu.zut.cs.javaee.epms.admin.service.RoleManager;
import edu.zut.cs.javaee.epms.base.service.impl.GenericManagerImpl;
/**
 * role managerimpl class
 * RoleManagerImpl extends GenericManagerImpl and it's RoleManager interface
 * @param Role class
 * @author lsz
 *
 */
@Component
public class RoleManagerImpl extends GenericManagerImpl<Role, Long> implements RoleManager {
	private Logger logger = LoggerFactory.getLogger(RoleManagerImpl.class);
	@Autowired
	private RoleDao roleDao;
	/**
	 * role managerimpl findByname method
	 * @return object for the role's name
	 * @author lsz
	 */
	@Override
	public Role getbyName(String name) {
		// TODO Auto-generated method stub
		return roleDao.findByName(name);
	}
}
