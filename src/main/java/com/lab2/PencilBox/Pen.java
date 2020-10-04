package com.lab2.PencilBox;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Pen implements Chancery {
    @Value("${chanceryItem.slateColor}")
    public String kernel;

    public Pen() {}

    public Pen(String kernel) {
        this.kernel = kernel;
    }

    @PostConstruct
    void initPenMethod() {
        System.out.println("Вызван Init метод, Pen;");
    }

    @PreDestroy
    void destroyMethod() {
        System.out.println("Вызван destroy метод, Pen;");
    }

    @Override
    public String draw() {
        return kernel;
    }
}
