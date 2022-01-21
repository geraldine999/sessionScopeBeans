package com.example.sessionscopebeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final SessionScopeBean sessionScopeBean;

    @Autowired
    public Controller(SessionScopeBean sessionScopeBean) {
        this.sessionScopeBean = sessionScopeBean;
    }

    @GetMapping(value = "/sessionscope")
    public String getSessionScopeData() {
        return sessionScopeBean.getColor();
    }

    @GetMapping(value = "/sessionscope-update")
    public String sessionScopeUpdated() {
        sessionScopeBean.setColor("Blue");
        return sessionScopeBean.getColor();
    }
}
