package edu.zut.cs.javaee.epms.module.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.javaee.epms.pay.domain.Pay;
import edu.zut.cs.javaee.epms.base.dao.DaoConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfig.class)
class ModuleDaoTest {

	@Autowired
	ModuleDao moduleDao;

	@Test
	//
	public void testFindByUsername() {
		moduleDao.findByName("name");
	}

}
