package com.example.Depedency.Injection;

import com.example.Depedency.Injection.Controllers.ConstructorInjectController;
import com.example.Depedency.Injection.Controllers.MyController;
import com.example.Depedency.Injection.Controllers.PropertyInjectController;
import com.example.Depedency.Injection.Controllers.SetterInjectCOntroller;
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
	System.out.println("-------------Proprty--------");
		PropertyInjectController propertyInjectController= (PropertyInjectController) con.getBean("propertyInjectController");
		System.out.println(propertyInjectController.getGreeting());
	System.out.println("-------------Setter--------");
		SetterInjectCOntroller setterInjectCOntroller= (SetterInjectCOntroller) con.getBean("setterInjectCOntroller");
		System.out.println(setterInjectCOntroller.getGreeting());
	System.out.println("-------------Constructor--------");
		ConstructorInjectController constructorInjectController= (ConstructorInjectController) con.getBean("constructorInjectController");
		System.out.println(constructorInjectController.getGreeting());
	}

}
