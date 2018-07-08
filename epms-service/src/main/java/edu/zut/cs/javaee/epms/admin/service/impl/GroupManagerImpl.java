package edu.zut.cs.javaee.epms.admin.service.impl;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.javaee.epms.admin.dao.GroupDao;
import edu.zut.cs.javaee.epms.admin.domain.Group;
import edu.zut.cs.javaee.epms.admin.service.GroupManager;
import edu.zut.cs.javaee.epms.base.service.impl.GenericManagerImpl;
/**
 * group managerimpl class
 * GroupManagerImpl extends GenericManagerImpl and it's GroupManager interface
 * @param GroupDao Dao
 * @author lsz
 *
 */
@Service("groupManager")
@Transactional
public class GroupManagerImpl extends GenericManagerImpl<Group, Long> implements GroupManager {

	GroupDao groupDao;
	private Logger logger = LoggerFactory.getLogger(GroupManagerImpl.class);
	@Autowired
	/**
	 * group managerimpl findByname method
	 * @return object for the group's name
	 * @author lsz
	 */
	@Override
	public Group getbyName(String name) {
		// TODO Auto-generated method stub
		return groupDao.findByName(name);
	}
}
