package com.tsi.hello.hello;

public class Greeting {
    String name;

    public  Greeting(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Hello, my name is " + name + "!";
    }
}
