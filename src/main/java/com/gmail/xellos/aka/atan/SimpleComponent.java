package com.gmail.xellos.aka.atan;

import org.springframework.stereotype.Component;

@Component
public class SimpleComponent {

    public SimpleComponent() {
        name = "This is a ComponentFoo";
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
