package edu.zut.cs.javaee.epms.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.javaee.epms.admin.domain.User;
import edu.zut.cs.javaee.epms.base.web.spring.controller.GenericController;
import edu.zut.cs.javaee.epms.admin.service.UserManager;

@Controller
@RequestMapping("/user")
public class UserController extends GenericController<User, Long, UserManager> {

	UserManager userManager;

	@Autowired
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
		this.manager = this.userManager;
	}

	@RequestMapping("/index")
	public String index() {
		return "user/index";
	}
}
