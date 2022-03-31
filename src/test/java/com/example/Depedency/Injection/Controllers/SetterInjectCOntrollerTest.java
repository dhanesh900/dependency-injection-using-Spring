package com.example.Depedency.Injection.Controllers;

import com.example.Depedency.Injection.Services.PropertyInjectGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectCOntrollerTest {

    private SetterInjectCOntroller setterInjectCOntroller;
    @BeforeEach
    void setUp() {
        setterInjectCOntroller=new SetterInjectCOntroller();
        setterInjectCOntroller.setGreetingService(new PropertyInjectGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectCOntroller.getGreeting());
    }
}