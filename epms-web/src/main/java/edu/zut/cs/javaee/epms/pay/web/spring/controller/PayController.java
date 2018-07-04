package edu.zut.cs.javaee.epms.pay.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import edu.zut.cs.javaee.epms.base.web.spring.controller.GenericController;
import edu.zut.cs.javaee.epms.pay.domain.Pay;
import edu.zut.cs.javaee.epms.pay.service.PayManager;

@Controller
@RequestMapping("/pay/pay")
public class PayController extends GenericController<Pay, Long, PayManager> {

	PayManager payManager;

    @RequestMapping(method = RequestMethod.GET, value = "/index.html")
    public String index() {
        return "pay/index";
    }

    @Autowired
    public void setPayManager(PayManager payManager) {
        this.payManager = payManager;
        this.manager = this.payManager;
    }
}
