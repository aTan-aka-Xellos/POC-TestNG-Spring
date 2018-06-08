package com.gmail.xellos.aka.atan;

import org.springframework.stereotype.Component;

@Component
public class ComponentFoo {

    public boolean returnTrue() {
        return true;
    }

    @Override
    public String toString() {
        return "ComponentFoo{}";
    }
}
