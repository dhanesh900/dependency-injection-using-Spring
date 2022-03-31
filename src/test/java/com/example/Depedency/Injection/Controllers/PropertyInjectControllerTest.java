package com.example.Depedency.Injection.Controllers;

import com.example.Depedency.Injection.Services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectControllerTest {

    private PropertyInjectController propertyInjectController;

    @BeforeEach
    void setUp() {
        propertyInjectController=new PropertyInjectController();
        propertyInjectController.greetingService=new GreetingServiceImpl();
    }
    @Test
    void getGreeting()
    {
        System.out.println(propertyInjectController.getGreeting());
    }
}