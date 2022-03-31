package com.example.Depedency.Injection.Controllers;

import com.example.Depedency.Injection.Services.GreetingService;

public class PropertyInjectController {
    public GreetingService greetingService;

    public String getGreeting()
    {
         return greetingService.sayGreeting();
    }
}
