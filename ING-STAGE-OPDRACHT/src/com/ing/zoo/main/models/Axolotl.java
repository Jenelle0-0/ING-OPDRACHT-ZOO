package com.ing.zoo.main.models;

public class Axolotl implements Animal, Carnivore {

    public String name;
    public String helloText;
    public String eatText;

    public Axolotl() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        helloText = "blub blub";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnomnom blobloblo";
        System.out.println(eatText);
    }
}
