package com.ing.zoo.main.models;

public class Hippo implements Animal, Herbivore {

    public String name;
    public String helloText;
    public String eatText;

    public Hippo() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        helloText = "splash";
        System.out.println(helloText);
    }
    @Override
    public void eatLeaves() {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
