package com.example.Depedency.Injection.Controllers;

import com.example.Depedency.Injection.Services.PropertyInjectGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectControllerTest {

    private ConstructorInjectController constructorInjectController;
    @BeforeEach
    void setUp() {
        constructorInjectController=new ConstructorInjectController(new PropertyInjectGreetingService());

    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectController.getGreeting());
    }
}