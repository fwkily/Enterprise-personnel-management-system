package edu.zut.cs.javaee.epms.ensure.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.epms.admin.dao.UserDao;
import edu.zut.cs.javaee.epms.admin.domain.User;
import edu.zut.cs.javaee.epms.admin.service.UserManager;
import edu.zut.cs.javaee.epms.base.service.impl.GenericManagerImpl;
import edu.zut.cs.javaee.epms.ensure.dao.EnsureDao;
import edu.zut.cs.javaee.epms.ensure.domain.Ensure;
import edu.zut.cs.javaee.epms.ensure.service.EnsureManager;
import edu.zut.cs.javaee.epms.pay.dao.PayDao;
import edu.zut.cs.javaee.epms.pay.domain.Pay;
import edu.zut.cs.javaee.epms.pay.service.PayManager;

@Component
public class EnsureManagerImpl extends GenericManagerImpl<Ensure, Long> implements EnsureManager {

	EnsureDao ensureDao;

	@Autowired
	public void setPayDao(PayDao payDao) {
		this.ensureDao = ensureDao;
		this.dao = this.ensureDao;
	}

	@Override
	public Ensure findbyName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
 
}
