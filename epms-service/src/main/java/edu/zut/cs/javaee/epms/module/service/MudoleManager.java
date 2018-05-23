package edu.zut.cs.javaee.epms.module.service;

import java.util.List;

public interface MudoleManager {

	List<Module> findByName(String module_name);
}
