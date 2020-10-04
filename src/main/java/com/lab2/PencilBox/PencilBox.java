package com.lab2.PencilBox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PencilBox {
    Chancery obj;

    public PencilBox() {
    }

    @PostConstruct
    void initPenMethod() {
        System.out.println("Вызван Init метод, PencilBox;");
    }

    @PreDestroy
    void destroyMethod() {
        System.out.println("Вызван destroy метод, PencilBox;");
    }

    @Autowired
    public void setObj(@Qualifier("pencilFabric") Chancery obj) {
        System.out.println("Вызван Set");
        this.obj = obj;
    }

    /*public PencilBox (@Qualifier("pen") Chancery obj) {
        System.out.println("Вызван Конструкторо");
        this.obj = obj;
    }*/

    public void print () {
        System.out.println("Мы воспользовались: "
                + obj.toString()
                + " Поле инициализированно:" + obj.draw());
    }
}
