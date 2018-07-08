package edu.zut.cs.javaee.epms.admin.service;

import edu.zut.cs.javaee.epms.admin.domain.Group;
import edu.zut.cs.javaee.epms.base.service.GenericManager;
/**
 * Group service
 * @author lsz
 */
public interface GroupManager extends GenericManager<Group, Long> {
	/**
	 * 
	 * Check the Group by the group's name
	 * @param name Group name
	 * @return
	 */
	Group getbyName(String name);
}
