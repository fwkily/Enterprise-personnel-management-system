package edu.zut.cs.javaee.epms.customer.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.javaee.epms.customer.domain.Customer;
import edu.zut.cs.javaee.epms.base.dao.DaoConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfig.class)
class CustomerDaoTest {

	@Autowired
	CustomerDao customerDao;

	@Test
	public void testFindByAddress() {
		customerDao.findByAddress("address");
	}

}
