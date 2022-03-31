package com.example.Depedency.Injection.Controllers;

import com.example.Depedency.Injection.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectController {
    @Qualifier("propertyInjectGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting()
    {
         return greetingService.sayGreeting();
    }
}
