package edu.zut.cs.javaee.epms.ensure.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.epms.base.service.impl.GenericManagerImpl;
import edu.zut.cs.javaee.epms.ensure.dao.EnsureDao;
import edu.zut.cs.javaee.epms.ensure.domain.Ensure;
import edu.zut.cs.javaee.epms.ensure.service.EnsureManager;

@Component
public class EnsureManagerImpl extends GenericManagerImpl<Ensure, Long> implements EnsureManager {

	EnsureDao ensureDao;

	@Autowired
	public void setEnsureDao(EnsureDao ensureDao) {
		this.ensureDao = ensureDao;
		this.dao = this.ensureDao;
	}

	@Override
	public Ensure findbyName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
 
}
