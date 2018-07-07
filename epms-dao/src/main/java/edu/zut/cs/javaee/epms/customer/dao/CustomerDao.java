package edu.zut.cs.javaee.epms.customer.dao;

import edu.zut.cs.javaee.epms.admin.domain.User;
import edu.zut.cs.javaee.epms.base.dao.GenericDao;
import edu.zut.cs.javaee.epms.customer.domain.Customer;
/*
 * create CustomerDao 
 */
public interface CustomerDao extends GenericDao<Customer, Long> {
	Customer findByAddress (String address);
}
