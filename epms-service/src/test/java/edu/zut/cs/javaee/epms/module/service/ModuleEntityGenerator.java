package edu.zut.cs.javaee.epms.module.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import  edu.zut.cs.javaee.epms.module.domain.Module;
import edu.zut.cs.javaee.epms.base.service.GenericGenerator;

public class ModuleEntityGenerator extends GenericGenerator {
	/**
	 * ModuleManager test class
	 * Module Database mapping test
	 * This class can test the availability of ModuleManager
	 * @author shiwujun
	 *
	 */
	@Autowired
	ModuleManager moduleManager;

	@Test
	public void gen_module() {
		for (int i = 0; i < 10; i++) {
			Module g = new Module();
			g.setName("Module_" + i);
			this.moduleManager.save(g);
			for (int j = 0; j < 10; j++) {
				Module module = new Module();
				module.setName("module_" + i + "_" + j);
				module.setParent(g);
				g = this.moduleManager.save(module);
			}
		}
	}

}
