package com.company;

import com.company.animals.*;
import com.company.interfaces.Tricks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * @author Alperen Kavakli
 */
public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[5];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        // I created this command because I felt bad for the omnivores. They deserve to eat something too.
        commands[4] = "omnivores eat";

        /*
        Because all animals now have the Animal class as a Parent, you declare them first as an animal and then the
        type of animal.
         */
        Animal henk = new Lion();
        henk.name = "henk";
        Animal elsa = new Hippo();
        elsa.name = "elsa";
        Animal dora = new Pig();
        dora.name = "dora";
        Animal wally = new Tiger();
        wally.name = "wally";
        Animal marty = new Zebra();
        marty.name = "marty";


        //The Dog and Wolf were created by me
        Animal karabas = new Dog();
        karabas.name = "karabas";
        Animal wolfie = new Wolf();
        wolfie.name = "wolfie";


        // I save all the animals in a Collection, so that I don't have to create an if statement for every animal.
        Collection<Animal> animalCollection = new ArrayList<>();
        animalCollection.add(henk);
        animalCollection.add(elsa);
        animalCollection.add(dora);
        animalCollection.add(wally);
        animalCollection.add(marty);
        animalCollection.add(karabas);
        animalCollection.add(wolfie);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        // If this boolean stays true, a line in the console will say that the command is unkown.
        boolean unkownCommand = true;


        //If a specific animal is called, only he/she will say hello.
        for (Animal animal : animalCollection) {
            if (input.equals(commands[0] + " " + animal.name)) {
                animal.sayHello();
                unkownCommand = false;
            }
        }

        //If the user only types hello, all animals will greet.
        if (input.equals(commands[0])) {
            unkownCommand = false;
            for (Animal animal : animalCollection) {
                animal.sayHello();
            }
        }

       /*With this else-if statement every herbivore gets leaves. A pig is not a herbivore even though it can eat herbs,
       so the pig doesn't get called (instruction was to make every herbivore to eat herbs). A pig is a omnivore, which
       means it can eat meat as well as herbs.
        */
        else if (input.equals(commands[1])) {
            unkownCommand = false;
            for (Animal animal : animalCollection) {
                if (animal instanceof Herbivore) {
                    ((Herbivore) animal).eatLeaves();
                }
            }
        }

        //If the animal is an instance of Carnivore, it will eat meat
        else if (input.equals(commands[2])) {
            unkownCommand = false;
            for (Animal animal : animalCollection) {
                if (animal instanceof Carnivore) {
                    ((Carnivore) animal).eatMeat();
                }
            }
        }

        //All animals that can do tricks will do it.
        else if (input.equals(commands[3])) {
            unkownCommand = false;
            for (Animal animal : animalCollection) {
                if (animal instanceof Tricks) {
                    ((Tricks) animal).performTrick();
                }

            }
        }

        //All omnivores will get something to eat.
        else if (input.equals(commands[4])) {
            unkownCommand = false;
            for (Animal animal : animalCollection) {
                if (animal instanceof Omnivore) {
                    ((Omnivore) animal).eatRandom();
                }
            }
        }


        // If unkownCommand is true, a line in the console will tell that there was an unknown command.
        if (unkownCommand) {
            System.out.println("Unknown command: " + input);
        }
    }
}
