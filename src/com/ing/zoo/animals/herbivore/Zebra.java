package com.ing.zoo.animals.herbivore;

import com.ing.zoo.Animal;
import com.ing.zoo.animals.Trick;

import java.util.Random;

public class Zebra extends Animal implements Herbivore, Trick {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra(String name) {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "jumps over obstacle";
        } else {
            trick = "puts on an afro";
        }
        System.out.println(trick);
    }
}
