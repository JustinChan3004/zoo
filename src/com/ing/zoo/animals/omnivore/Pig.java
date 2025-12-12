package com.ing.zoo.animals.omnivore;

import com.ing.zoo.Animal;
import com.ing.zoo.animals.Trick;
import com.ing.zoo.animals.carnivore.Carnivore;
import com.ing.zoo.animals.herbivore.Herbivore;

import java.util.Random;

public class Pig extends Animal implements Carnivore, Herbivore, Trick {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Pig(String name) {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
