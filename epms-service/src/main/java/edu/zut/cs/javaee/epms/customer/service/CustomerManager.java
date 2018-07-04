package edu.zut.cs.javaee.epms.customer.service;

import edu.zut.cs.javaee.epms.base.service.GenericManager;
import edu.zut.cs.javaee.epms.customer.domain.Customer;

import java.util.List;

public interface CustomerManager extends GenericManager<Customer, Long>{

	List<Customer> findAll();
	Customer findbyPostcode(String postcode);
}
