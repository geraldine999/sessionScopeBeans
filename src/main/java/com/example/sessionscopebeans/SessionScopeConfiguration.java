package com.example.sessionscopebeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SessionScopeConfiguration {

    private SessionScopeBean sessionScopeBean;

    @Autowired
    public SessionScopeConfiguration(SessionScopeBean sessionScopeBean) {
        this.sessionScopeBean = sessionScopeBean;
    }


}
