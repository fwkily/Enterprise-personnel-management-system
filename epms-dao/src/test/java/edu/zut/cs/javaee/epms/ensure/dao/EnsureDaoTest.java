package edu.zut.cs.javaee.epms.ensure.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.javaee.epms.ensure.domain.Ensure;
import edu.zut.cs.javaee.epms.base.dao.DaoConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfig.class)
class EnsureDaoTest {

	@Autowired
	EnsureDao ensureDao;

	@Test
	public void testFindByName() {
		ensureDao.findByName("Name");
	}

}
