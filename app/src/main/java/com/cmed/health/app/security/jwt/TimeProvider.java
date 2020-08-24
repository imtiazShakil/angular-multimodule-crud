package com.cmed.health.app.security.jwt;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class TimeProvider implements Serializable {

    private static final long serialVersionUID = -4755691501248416099L;

    public Date now() {
        return new Date();
    }
}
