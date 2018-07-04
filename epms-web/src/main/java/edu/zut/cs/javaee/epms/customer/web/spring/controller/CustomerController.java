package edu.zut.cs.javaee.epms.customer.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import edu.zut.cs.javaee.epms.base.web.spring.controller.GenericController;
import edu.zut.cs.javaee.epms.customer.domain.Customer;
import edu.zut.cs.javaee.epms.customer.service.CustomerManager;

@Controller
@RequestMapping("/customer/customer")
public class CustomerController extends GenericController<Customer, Long, CustomerManager> {

	CustomerManager customerManager;

    @RequestMapping(method = RequestMethod.GET, value = "/index.html")
    public String index() {
        return "customer/index";
    }

    @Autowired
    public void setCustomerManager(CustomerManager customerManager) {
        this.customerManager = customerManager;
        this.manager = this.customerManager;
    }
}
