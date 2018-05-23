package edu.zut.cs.javaee.epms.admin.service.impl;

import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.epms.admin.domain.Role;
import edu.zut.cs.javaee.epms.admin.service.RoleManager;
import edu.zut.cs.javaee.epms.base.service.impl.GenericManagerImpl;

@Component
public class RoleManagerImpl extends GenericManagerImpl<Role, Long> implements RoleManager {

}
