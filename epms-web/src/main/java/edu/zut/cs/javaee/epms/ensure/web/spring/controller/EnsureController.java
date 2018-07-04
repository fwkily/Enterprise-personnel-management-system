package edu.zut.cs.javaee.epms.ensure.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.epms.ensure.domain.Ensure;
import edu.zut.cs.javaee.epms.ensure.service.EnsureManager;
import edu.zut.cs.javaee.epms.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/ensure/ensure")
public class EnsureController extends GenericController<Ensure, Long, EnsureManager> {

	EnsureManager ensureManager;

    @RequestMapping(method = RequestMethod.GET, value = "/index.html")
    public String index() {
        return "ensure/index";
    }

    @Autowired
    public void setEnsureManager(EnsureManager ensureManager) {
        this.ensureManager = ensureManager;
        this.manager = this.ensureManager;
    }
}
