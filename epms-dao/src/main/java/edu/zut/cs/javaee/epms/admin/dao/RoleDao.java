package edu.zut.cs.javaee.epms.admin.dao;

import edu.zut.cs.javaee.epms.admin.domain.Role;
import edu.zut.cs.javaee.epms.base.dao.GenericDao;
/*
 * Create RoleDao
 */
public interface RoleDao extends GenericDao<Role, Long> {
	Role findByName(String name);
}
