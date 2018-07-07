package edu.zut.cs.javaee.epms.ensure.service;

import java.util.List;

import edu.zut.cs.javaee.epms.base.service.GenericManager;
import edu.zut.cs.javaee.epms.ensure.domain.Ensure;
/**
 * Ensure service
 * @author lsz
 */
public interface EnsureManager extends GenericManager<Ensure, Long>
{
	/**
	 * 
	 * Check All Ensure 
	 * Check the Ensure by the ensure's name
	 * @param name Ensure name 
	 * @return
	 */
	List<Ensure> findAll();
	Ensure findbyName(String name);
}
