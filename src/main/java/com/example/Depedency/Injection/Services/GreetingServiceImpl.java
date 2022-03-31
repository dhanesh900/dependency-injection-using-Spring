package com.example.Depedency.Injection.Services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hello Springboot Developers";
    }
}
