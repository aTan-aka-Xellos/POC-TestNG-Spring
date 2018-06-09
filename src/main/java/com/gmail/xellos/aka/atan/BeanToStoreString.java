package com.gmail.xellos.aka.atan;

public class BeanToStoreString {

    public BeanToStoreString(String value) {
        System.out.println("Create BeanToStoreString with string: " + value);
        this.string = value;
    }

    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}
