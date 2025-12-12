package com.ing.zoo.animals.omnivore;

import com.ing.zoo.Animal;
import com.ing.zoo.animals.Trick;
import com.ing.zoo.animals.carnivore.Carnivore;
import com.ing.zoo.animals.herbivore.Herbivore;

import java.util.Random;

public class Panda extends Animal implements Carnivore, Herbivore, Trick {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Panda(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "panda panda";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom thx";
        System.out.println(eatText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch munch";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "climbs a tree";
        } else {
            trick = "rolls on the ground";
        }
        System.out.println(trick);
    }
}
