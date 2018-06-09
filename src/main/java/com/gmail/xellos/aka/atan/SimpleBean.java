package com.gmail.xellos.aka.atan;

public class SimpleBean {

    public SimpleBean(String name) {
        System.out.println("Create SimpleBean with name: " + name);
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
