package edu.zut.cs.javaee.epms.module.dao;

import edu.zut.cs.javaee.epms.base.dao.GenericDao;
import edu.zut.cs.javaee.epms.ensure.domain.Ensure;
import edu.zut.cs.javaee.epms.module.domain.Module;
/*
 * Create ModuleDao
 */
public interface ModuleDao extends GenericDao<Module, Long> {
	Module findByName (String name);
}
