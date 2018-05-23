package edu.zut.cs.javaee.epms.customer.service;

import edu.zut.cs.javaee.epms.admin.domain.User;

import java.util.List;

public interface CustomerManager {

    /**
     * get customers according to postcode
     *
     * @param postcode
     * @return
     */
    List<User> findByPostcode(String postcode);
}
