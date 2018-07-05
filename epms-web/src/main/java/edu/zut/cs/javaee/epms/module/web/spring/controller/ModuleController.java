package edu.zut.cs.javaee.epms.module.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import edu.zut.cs.javaee.epms.base.web.spring.controller.GenericController;
import edu.zut.cs.javaee.epms.module.service.ModuleManager;
import edu.zut.cs.javaee.epms.module.domain.Module;

@Controller
@RequestMapping("/module/module")
public class ModuleController extends GenericController<Module, Long, ModuleManager> {

	ModuleManager moduleManager;

    @RequestMapping(method = RequestMethod.GET, value = "/index.html")
    public String index() {
        return "module/index";
    }

    @Autowired
    public void setPayManager(ModuleManager moduleManager) {
        this.moduleManager = moduleManager;
        this.manager = this.moduleManager;
    }
}
