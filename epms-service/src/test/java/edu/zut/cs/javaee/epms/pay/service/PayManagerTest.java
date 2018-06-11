package edu.zut.cs.javaee.epms.pay.service;

import edu.zut.cs.javaee.epms.admin.service.AdminServiceConfig;
import edu.zut.cs.javaee.epms.pay.domain.Pay;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AdminServiceConfig.class)
public class PayManagerTest {

    @Autowired
    PayManager payManager;

    @Test
    public void testFindByPayname() {
        String payname = "NR74DU";
        Pay result = this.payManager.findbyName(payname);
        System.out.println(result);
    }

}
