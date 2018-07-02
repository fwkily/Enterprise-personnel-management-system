package edu.zut.cs.javaee.epms.pay.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.javaee.epms.base.web.spring.controller.GenericTreeController;
import edu.zut.cs.javaee.epms.module.domain.Module;
import edu.zut.cs.javaee.epms.module.service.ModuleManager;

@Controller
@RequestMapping("/module")
public class PayController extends GenericTreeController<Module, Long, ModuleManager> {

    ModuleManager moduleManager;

    @Autowired
    public void setModuleManager(ModuleManager moduleManager) {
        this.moduleManager = moduleManager;
        this.manager = this.moduleManager;
        this.treeManager = this.moduleManager;
    }

}
