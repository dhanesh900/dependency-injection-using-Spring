package com.example.Depedency.Injection.Controllers;

import com.example.Depedency.Injection.Services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectController {

    private GreetingService greetingService;

    public ConstructorInjectController(@Qualifier("constructorInjectGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
