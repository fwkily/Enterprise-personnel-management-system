package edu.zut.cs.javaee.epms.ensure.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.javaee.epms.base.web.spring.controller.GenericController;
import edu.zut.cs.javaee.epms.ensure.domain.Ensure;
import edu.zut.cs.javaee.epms.ensure.service.EnsureManager;

@Controller
@RequestMapping("/ensure")
public class EnsureController extends GenericController<Ensure, Long, EnsureManager> {

	EnsureManager ensureManager;

    @Autowired
    public void setEnsureManager(EnsureManager ensureManager) {
        this.ensureManager = ensureManager;
        this.manager = this.ensureManager;
    }

}
