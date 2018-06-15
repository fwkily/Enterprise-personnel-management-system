package edu.zut.cs.javaee.epms.customer.service.impl;

import edu.zut.cs.javaee.epms.base.service.impl.GenericManagerImpl;
import edu.zut.cs.javaee.epms.customer.dao.CustomerDao;
import edu.zut.cs.javaee.epms.customer.domain.Customer;
import edu.zut.cs.javaee.epms.customer.service.CustomerManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerManagerImpl extends GenericManagerImpl<Customer, Long> implements CustomerManager {

	CustomerDao customerDao;

	@Autowired
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
		this.dao = this.customerDao;
	}

	@Override
	public Customer findbyPostcode(String postcode) {
		// TODO Auto-generated method stub
		return null;
	}
 
}
