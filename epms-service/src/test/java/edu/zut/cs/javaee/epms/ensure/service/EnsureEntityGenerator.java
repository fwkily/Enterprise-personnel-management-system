package edu.zut.cs.javaee.epms.ensure.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.epms.base.service.GenericGenerator;
import edu.zut.cs.javaee.epms.ensure.domain.Ensure;

public class EnsureEntityGenerator extends GenericGenerator {

	@Autowired
	EnsureManager ensureManager;

	@Test
	public void gen_ensure() {
		for (int i = 0; i < 10; i++) {
			Ensure g = new Ensure();
			g.setName("ensure_" + i);
			this.ensureManager.save(g);
			for (int j = 0; j < 10; j++)
			{
				Ensure ensure = new Ensure();
				ensure.setName("ensure_" + i + "_" + j);
				ensure.setParent(g);
				g = this.ensureManager.save(ensure) ;     
		
			}
		}
	}
}
