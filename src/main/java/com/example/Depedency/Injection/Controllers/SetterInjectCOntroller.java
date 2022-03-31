package com.example.Depedency.Injection.Controllers;

import com.example.Depedency.Injection.Services.GreetingService;

public class SetterInjectCOntroller {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
