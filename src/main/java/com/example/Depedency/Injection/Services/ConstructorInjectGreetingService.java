package com.example.Depedency.Injection.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hello Springboot Developer - constructor Inject Services";
    }
}
