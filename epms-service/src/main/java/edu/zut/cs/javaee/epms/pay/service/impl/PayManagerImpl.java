package edu.zut.cs.javaee.epms.pay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.epms.admin.dao.UserDao;
import edu.zut.cs.javaee.epms.admin.domain.User;
import edu.zut.cs.javaee.epms.admin.service.UserManager;
import edu.zut.cs.javaee.epms.base.service.impl.GenericManagerImpl;
import edu.zut.cs.javaee.epms.pay.dao.PayDao;
import edu.zut.cs.javaee.epms.pay.domain.Pay;
import edu.zut.cs.javaee.epms.pay.service.PayManager;

@Component
public class PayManagerImpl extends GenericManagerImpl<Pay, Long> implements PayManager {

	PayDao payDao;

	@Autowired
	public void setPayDao(PayDao payDao) {
		this.payDao = payDao;
		this.dao = this.payDao;
	}

	@Override
	public Pay findbyName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
 
}
