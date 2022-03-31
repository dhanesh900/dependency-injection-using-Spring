package com.example.Depedency.Injection.Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public  String sayHello()
    {
        System.out.println("hello this this controller");
        return "hi geeks";
    }
}
