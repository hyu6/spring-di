package com.github.hyu6.springdi;

import com.github.hyu6.springdi.controllers.ConstructorInjectedController;
import com.github.hyu6.springdi.controllers.MyController;
import com.github.hyu6.springdi.controllers.PropertyInjectedController;
import com.github.hyu6.springdi.controllers.SetterInjectedController;
import com.github.hyu6.springdi.controllers.old.I18nController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

        System.out.println("-------- Primary Bean --------");

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println(myController.hello());

//        System.out.println("-------- Pet --------");
//
//        PetController petController = ctx.getBean("petController", PetController.class);
//        System.out.println(petController.whichPetIsTheBest());

        System.out.println("-------- I18n --------");

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");

        System.out.println(i18nController.hello());

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
