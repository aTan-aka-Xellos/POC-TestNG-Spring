package com.gmail.xellos.aka.atan;

import org.springframework.stereotype.Component;

@Component
public class SimpleComponent {

    public SimpleComponent() {
        System.out.println("Create SimpleComponent");
        name = "This is a SimpleComponent";
    }

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
