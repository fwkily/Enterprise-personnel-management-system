package edu.zut.cs.javaee.epms.admin.dao;

import edu.zut.cs.javaee.epms.admin.domain.Group;
import edu.zut.cs.javaee.epms.base.dao.GenericTreeDao;
/*
 * Create GroupDao
 */
public interface GroupDao extends GenericTreeDao<Group, Long> {
	Group findByName (String name);
}
