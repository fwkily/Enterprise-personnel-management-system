package edu.zut.cs.javaee.epms.pay.dao;

import edu.zut.cs.javaee.epms.admin.domain.User;
import edu.zut.cs.javaee.epms.base.dao.GenericDao;
import edu.zut.cs.javaee.epms.pay.domain.Pay;
/*
 * Create PayDao
 */
public interface PayDao extends GenericDao<Pay, Long> {
	Pay findByName (String name);
}
