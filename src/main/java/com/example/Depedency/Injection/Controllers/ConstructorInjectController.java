package com.example.Depedency.Injection.Controllers;

import com.example.Depedency.Injection.Services.GreetingService;

public class ConstructorInjectController {
    private GreetingService greetingService;

    public ConstructorInjectController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
