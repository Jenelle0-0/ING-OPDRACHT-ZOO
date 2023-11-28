package com.ing.zoo.main.models;

import java.util.Random;

public class Panda implements Animal, Herbivore, Trickster {

    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Panda() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        helloText = "woopowoopo";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "yum yum";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        //Generates random number
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "claps paws";
        } else {
            trick = "jumps over rock";
        }
        System.out.println(trick);
    }
}
