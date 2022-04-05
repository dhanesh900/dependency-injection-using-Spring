package com.example.Depedency.Injection.Controllers;

import com.example.Depedency.Injection.Services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public  String sayHello()
    {

        return greetingService.sayGreeting();
    }
}
