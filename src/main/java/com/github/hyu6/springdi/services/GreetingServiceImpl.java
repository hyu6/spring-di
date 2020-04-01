package com.github.hyu6.springdi.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Hello world";
    }
}
