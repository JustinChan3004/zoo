package com.ing.zoo;

import com.ing.zoo.animals.Trick;
import com.ing.zoo.animals.carnivore.Carnivore;
import com.ing.zoo.animals.carnivore.Wolf;
import com.ing.zoo.animals.herbivore.Herbivore;
import com.ing.zoo.animals.herbivore.Hippo;
import com.ing.zoo.animals.carnivore.Lion;
import com.ing.zoo.animals.carnivore.Tiger;
import com.ing.zoo.animals.herbivore.Zebra;
import com.ing.zoo.animals.omnivore.Panda;
import com.ing.zoo.animals.omnivore.Pig;

import java.util.Scanner;

/**
 * Main class of the Zoo application
 * This class reads the user input from the console and
 * triggers the appropriate actions of the animals
 */
public class Zoo {
    public static void main(String[] args) {

        // Available commands
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        // All the animals in the zoo
        Animal[] animals = new Animal[7];
        animals[0] = new Lion("henk");
        animals[1] = new Hippo("elsa");
        animals[2] = new Pig("dora");
        animals[3] = new Tiger("wally");
        animals[4] = new Zebra("marty");
        animals[5] = new Wolf("floof");
        animals[6] = new Panda("po");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Zoo");
        System.out.println("These are the animals:");

        // Prints all the animals with their Class name and given name
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + ": " + animal.name);
        }

        System.out.print("Voer uw command in: ");

        // Reads the input of user and normalise it
        String input = scanner.nextLine().trim().toLowerCase();

        // Handles the "hello" command
        if (input.equals(commands[0])) {
            sayHelloToAll(animals);
        } else if (input.startsWith(commands[0])) {
            // Extracts the animal name from the input after "hello "
            String animalName = input.substring(commands[0].length() + 1);
            sayHelloToOne(animals, animalName);
        }
        // Handles the "give leaves" command
        else if (input.equals(commands[1])) {
            // Feeds leaves to the animals
            for (Animal animal : animals) {
                // Checks if the animal is a herbivore
                if (animal instanceof Herbivore) {
                    ((Herbivore) animal).eatLeaves();
                }
            }
        }
        // Handles the "give meat" command
        else if (input.equals(commands[2])) {
            // Feeds meat to the animals
            for (Animal animal : animals) {
                // Checks if the animal is a carnivore
                if (animal instanceof Carnivore) {
                    ((Carnivore) animal).eatMeat();
                }
            }
        }
        // Handles the "perform trick" command
        else if (input.equals(commands[3])) {
            // Makes all the animals that can perform a trick do so
            for (Animal animal : animals) {
                if (animal instanceof Trick) {
                    ((Trick) animal).performTrick();
                }
            }
        } else {
            System.out.println("Unknown command: " + input);
        }
    }

    /**
     * Helper function that makes all animals in the zoo say hello
     * @param animals array of animals in the zoo
     */
    static void sayHelloToAll(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sayHello();
            return;
        }
    }

    /**
     * Helper function that makes a specific animal name say hello
     * @param animals array of animals in the zoo
     * @param name name of the animal
     */
    static void sayHelloToOne(Animal[] animals, String name) {
        for (Animal animal : animals) {
            if (animal.name.equalsIgnoreCase(name)) {
                animal.sayHello();
                return;
            }
        }
        // If there is no animal that matches the given name
        System.out.println("There is no animal with the name: " + name);
    }
}
