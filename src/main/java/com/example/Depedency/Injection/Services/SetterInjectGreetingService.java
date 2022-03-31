package com.example.Depedency.Injection.Services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hello Springboot Developer - setter Inject Service";
    }
}
