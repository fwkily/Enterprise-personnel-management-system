package edu.zut.cs.javaee.epms.pay.service;

import java.util.List;

import edu.zut.cs.javaee.epms.base.service.GenericManager;
import edu.zut.cs.javaee.epms.pay.domain.Pay;

public interface PayManager extends GenericManager<Pay, Long> {
	List<Pay> findAll();
	Pay findbyName(String payname);
}
