package edu.zut.cs.javaee.epms.customer.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.epms.base.service.GenericGenerator;
import edu.zut.cs.javaee.epms.customer.domain.Customer;

public class CustomerEntityGenerator extends GenericGenerator {

	@Autowired
	CustomerManager customerManager;

	@Test
	public void gen_customer() {
		for (int i = 0; i < 10; i++) {
			Customer g = new Customer();
			g.setAddress("customer_" + i);
			this.customerManager.save(g);
			for (int j = 0; j < 10; j++) {
				Customer customer = new Customer();
				customer.setAddress("customer_" + i + "_" + j);
				customer.setParent(g);
				g = this.customerManager.save(customer);
			}
		}
	}

}
