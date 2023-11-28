package com.ing.zoo.main;

import com.ing.zoo.main.models.*;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        //Array with commands an animal can get
        String[] commands = {"hello", "give leaves", "give meat", "perform trick"};

        //All the current animals
        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Panda lola = new Panda();
        lola.name = "lola";
        Axolotl vivienne = new Axolotl();
        vivienne.name = "vivienne";

        //All current animals in an array of the type 'Animal'
        Animal[] animals = {henk, elsa, dora, wally, marty, lola, vivienne};

        //Scanner to read the users input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your command: ");
        String input = scanner.nextLine();

        //A boolean to know if a command has succeeded
        boolean commandSuccessful = false;

        for (Animal animal : animals) {

            if (input.equals(commands[0])) {
                //All animals in the 'animals' array will "say hello"
                animal.sayHello();
                commandSuccessful = true;
                //Name is specified
            } else if (input.equals(commands[0] + " " + animal.getName())) {
                //Specified animal "says hello"
                animal.sayHello();
                commandSuccessful = true;
            } else if (input.equals(commands[1])) {
                if (animal instanceof Herbivore) {
                    //Only animals that are herbivore will "eat leaves"
                    ((Herbivore) animal).eatLeaves();
                    commandSuccessful = true;
                }
            } else if (input.equals(commands[2])) {
                if (animal instanceof Carnivore) {
                    //Only animals that are carnivore will "eat meat"
                    ((Carnivore) animal).eatMeat();
                    commandSuccessful = true;
                }
            } else if (input.equals(commands[3])) {
                if (animal instanceof Trickster) {
                    //Only animals that can perform will "perform a trick"
                    ((Trickster) animal).performTrick();
                    commandSuccessful = true;
                }
            }
        }
        //There was no match between the input and an existing command
        if (!commandSuccessful) {
            System.out.println("Unknown command: " + input);
        }
    }
}
