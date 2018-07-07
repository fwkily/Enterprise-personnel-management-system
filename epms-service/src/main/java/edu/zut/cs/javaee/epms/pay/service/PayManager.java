package edu.zut.cs.javaee.epms.pay.service;

import java.util.List;

import edu.zut.cs.javaee.epms.base.service.GenericManager;
import edu.zut.cs.javaee.epms.pay.domain.Pay;
/**
 * Pay service
 * @author zhougenhui
 */
public interface PayManager extends GenericManager<Pay, Long> {
	/**
	 * 
	 * Check All Pay 
	 * Check the Pay by the pay's name
	 * @param username Pay name 
	 * @return
	 */
	List<Pay> findAll();
	Pay findbyName(String payname);
}

