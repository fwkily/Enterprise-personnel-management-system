package edu.zut.cs.javaee.epms.ensure.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.epms.base.service.impl.GenericManagerImpl;
import edu.zut.cs.javaee.epms.ensure.dao.EnsureDao;
import edu.zut.cs.javaee.epms.ensure.domain.Ensure;
import edu.zut.cs.javaee.epms.ensure.service.EnsureManager;
/**
 * ensure managerimpl class
 * EnsureManagerImpl extends GenericManagerImpl and it's GroupManager interface
 * @param EnsureDao Dao
 * @author lsz
 *
 */
@Component
public class EnsureManagerImpl extends GenericManagerImpl<Ensure, Long> implements EnsureManager {

	EnsureDao ensureDao;

	@Autowired
	public void setEnsureDao(EnsureDao ensureDao) {
		this.ensureDao = ensureDao;
		this.dao = this.ensureDao;
	}
	/**
	 * ensure managerimpl findByname method
	 * @return object for the ensure's name
	 * @author lsz
	 */
	@Override
	public Ensure findbyName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
 
}
