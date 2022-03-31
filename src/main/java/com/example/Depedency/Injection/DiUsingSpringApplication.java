package com.example.Depedency.Injection;

import com.example.Depedency.Injection.Controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiUsingSpringApplication {

	public static void main(String[] args) {

	ApplicationContext con= SpringApplication.run(DiUsingSpringApplication.class, args);
	MyController myController= (MyController) con.getBean("myController");
	String greet=myController.sayHello();
	System.out.println(greet);
	}

}
