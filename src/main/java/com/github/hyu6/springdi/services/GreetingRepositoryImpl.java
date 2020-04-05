package com.github.hyu6.springdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "English greeting - primary service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Spanish greeting";
    }

    @Override
    public String getGermanGreeting() {
        return "German greeting";
    }
}
