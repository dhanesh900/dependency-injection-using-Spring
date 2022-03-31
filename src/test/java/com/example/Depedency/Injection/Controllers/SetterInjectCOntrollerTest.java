package com.example.Depedency.Injection.Controllers;

import com.example.Depedency.Injection.Services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectCOntrollerTest {

    private SetterInjectCOntroller setterInjectCOntroller;
    @BeforeEach
    void setUp() {
        setterInjectCOntroller=new SetterInjectCOntroller();
        setterInjectCOntroller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectCOntroller.getGreeting());
    }
}