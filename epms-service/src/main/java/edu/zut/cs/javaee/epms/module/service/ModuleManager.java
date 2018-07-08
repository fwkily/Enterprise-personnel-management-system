package edu.zut.cs.javaee.epms.module.service;

import  edu.zut.cs.javaee.epms.module.domain.Module;
import edu.zut.cs.javaee.epms.pay.domain.Pay;

import java.util.List;

import edu.zut.cs.javaee.epms.base.service.GenericTreeManager;

public interface ModuleManager extends GenericTreeManager<Module, Long>{
	/**
	 * 
	 * Check All  Module
	 * Check the Module by the module's name
	 * @param username Module name 
	 * @return
	 */
	List<Module> findAll();
	Module findbyName(String modulename);

}
