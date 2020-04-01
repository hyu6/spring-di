package com.github.hyu6.springdi.controllers;

import com.github.hyu6.springdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.greeting();
    }

}
