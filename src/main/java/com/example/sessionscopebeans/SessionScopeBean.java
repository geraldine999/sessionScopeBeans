package com.example.sessionscopebeans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@Getter
@Setter
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionScopeBean {

    private String color = "Red";

    public SessionScopeBean() {
        System.out.println("SessionScopeBean Constructor Called");
    }


}
