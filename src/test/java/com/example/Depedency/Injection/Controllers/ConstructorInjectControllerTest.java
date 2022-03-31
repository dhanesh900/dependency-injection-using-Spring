package com.example.Depedency.Injection.Controllers;

import com.example.Depedency.Injection.Services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectControllerTest {

    private ConstructorInjectController constructorInjectController;
    @BeforeEach
    void setUp() {
        constructorInjectController=new ConstructorInjectController(new GreetingServiceImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectController.getGreeting());
    }
}