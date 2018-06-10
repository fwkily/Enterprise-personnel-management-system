package edu.zut.cs.javaee.epms.ensure.service;

import java.util.List;

import edu.zut.cs.javaee.epms.base.service.GenericManager;
import edu.zut.cs.javaee.epms.ensure.domain.Ensure;

public interface EnsureManager extends GenericManager<Ensure, Long> {

	List<Ensure> findAll();
	Ensure findbyName(String name);
}
