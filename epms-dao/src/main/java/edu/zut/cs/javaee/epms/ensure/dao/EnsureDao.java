package edu.zut.cs.javaee.epms.ensure.dao;

import edu.zut.cs.javaee.epms.admin.domain.User;
import edu.zut.cs.javaee.epms.base.dao.GenericDao;
import edu.zut.cs.javaee.epms.ensure.domain.Ensure;
import edu.zut.cs.javaee.epms.module.domain.Module;
/*
 * Create EnsureDao
 */
public interface EnsureDao extends GenericDao<Ensure, Long> {
	Ensure findByName (String name);
}
