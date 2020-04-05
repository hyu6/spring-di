package com.github.hyu6.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO = "HELLO - Original";

    @Override
    public String greeting() {
        return HELLO;
    }
}
