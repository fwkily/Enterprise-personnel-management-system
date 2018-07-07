package edu.zut.cs.javaee.epms.customer.service;

import edu.zut.cs.javaee.epms.base.service.GenericManager;
import edu.zut.cs.javaee.epms.customer.domain.Customer;

import java.util.List;
/**
 * Customer service
 */

public interface CustomerManager extends GenericManager<Customer, Long>{
	/**
	 * 
	 * Check All Customer 
	 * Check the Customer by the customer's name
	 * @param username Customer name 
	 * @return
	 */
	List<Customer> findAll();
	Customer findbyPostcode(String postcode);
}
