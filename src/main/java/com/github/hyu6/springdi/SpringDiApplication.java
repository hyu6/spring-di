package com.github.hyu6.springdi;

import com.github.hyu6.springdi.controllers.ConstructorInjectedController;
import com.github.hyu6.springdi.controllers.MyController;
import com.github.hyu6.springdi.controllers.PropertyInjectedController;
import com.github.hyu6.springdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greetings = myController.hello();

        System.out.println(greetings);

        System.out.println("-------- Property --------");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("-------- Setter --------");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-------- Constructor --------");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
    }

}
