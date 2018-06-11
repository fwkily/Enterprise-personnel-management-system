package edu.zut.cs.javaee.epms.pay.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.epms.base.service.GenericGenerator;
import edu.zut.cs.javaee.epms.pay.domain.Pay;

public class PayEntityGenerator extends GenericGenerator {

	@Autowired
	PayManager payManager;

	@Test
	public void gen_pay() {
		for (int i = 0; i < 10; i++) {
			Pay g = new Pay();
			g.setName("pay_" + i);
			this.payManager.save(g);
			for (int j = 0; j < 10; j++) {
				Pay pay = new Pay();
				pay.setName("pay_" + i + "_" + j);
				pay.setParent(g);
				g = this.payManager.save(pay);
			}
		}
	}

}
