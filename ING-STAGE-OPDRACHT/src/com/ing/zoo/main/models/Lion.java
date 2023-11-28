package com.ing.zoo.main.models;

public class Lion implements Animal, Carnivore {

    public String name;
    public String helloText;
    public String eatText;

    public Lion() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
