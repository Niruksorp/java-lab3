package com.lab2;

import com.lab2.PencilBox.Pencil;
import com.lab2.PencilBox.PencilBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class Lab2Application {


    private static ApplicationContext applicationContext;

    public static void main(String[] args) {

        applicationContext = SpringApplication.run(Lab2Application.class, args);

        PencilBox pencilBox =  applicationContext.getBean(PencilBox.class);
        pencilBox.print();

    }

}
