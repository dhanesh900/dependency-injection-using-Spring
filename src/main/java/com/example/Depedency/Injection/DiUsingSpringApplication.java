package com.example.Depedency.Injection;

import com.example.Depedency.Injection.Controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiUsingSpringApplication {

	public static void main(String[] args) {

	ApplicationContext con= SpringApplication.run(DiUsingSpringApplication.class, args);
	MyController myController= (MyController) con.getBean("myController");
	I18nController i18nController= (I18nController) con.getBean("i18nController");

		System.out.println("-------------Interlization--------");
		System.out.println(i18nController.sayHello());
        System.out.println("-------------Primary--------");
		System.out.println(myController.sayHello());
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
