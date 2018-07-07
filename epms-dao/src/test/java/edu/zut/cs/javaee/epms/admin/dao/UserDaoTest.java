package edu.zut.cs.javaee.epms.admin.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.javaee.epms.admin.domain.User;
import edu.zut.cs.javaee.epms.base.dao.DaoConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfig.class)
class UserDaoTest {

	@Autowired
	UserDao userDao;

	@Test
	public void testFindByUsername() {
		userDao.findByUsername("username1");
	}

}
