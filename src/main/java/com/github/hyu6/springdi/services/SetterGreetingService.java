package com.github.hyu6.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Setter greeting";
    }
}
