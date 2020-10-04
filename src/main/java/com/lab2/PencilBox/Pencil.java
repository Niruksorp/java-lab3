package com.lab2.PencilBox;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Qualifier("pencil")
public class Pencil implements Chancery{

    private String slateColor;

    public Pencil(String slateColor) {
        this.slateColor = slateColor;
    }

    @PostConstruct
    void initPenMethod() {
        System.out.println("Вызван Init метод, Pencil;");
    }

    @PreDestroy
    void destroyMethod() {
        System.out.println("Вызван destroy метод, Pencil;");
    }

    public Pencil() {
    }

    public void setSlateColor(String slateColor) {
        this.slateColor = slateColor;
    }

    @Override
    public String draw() {
        return slateColor;
    }

    @Bean
    @Qualifier("pencilFabric")
    public static Pencil getPencil() {
        return new Pencil("Black");
    }
}
