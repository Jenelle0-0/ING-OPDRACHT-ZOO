package com.ing.zoo.main.models;

import java.util.Random;

public class Pig implements Animal, Herbivore, Carnivore, Trickster {

    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Pig() {
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
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        //Generates random number
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
