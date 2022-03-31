package com.example.Depedency.Injection.Controllers;

import com.example.Depedency.Injection.Services.PropertyInjectGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectControllerTest {

    private PropertyInjectController propertyInjectController;

    @BeforeEach
    void setUp() {
        propertyInjectController=new PropertyInjectController();
        propertyInjectController.greetingService=new PropertyInjectGreetingService();
    }
    @Test
    void getGreeting()
    {
        System.out.println(propertyInjectController.getGreeting());
    }
}