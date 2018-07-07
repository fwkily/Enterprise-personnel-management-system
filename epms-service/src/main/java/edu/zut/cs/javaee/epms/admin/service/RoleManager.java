package edu.zut.cs.javaee.epms.admin.service;

import edu.zut.cs.javaee.epms.admin.domain.Role;
import edu.zut.cs.javaee.epms.base.service.GenericManager;
/**
 * Role service
 * @author lsz
 */
public interface RoleManager extends GenericManager<Role, Long> {
	/**
	 * 
	 * Check the Role by the role's name
	 * @param name Role name
	 * @return
	 */
	Role getbyName(String name);
}
