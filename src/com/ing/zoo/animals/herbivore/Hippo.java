package com.ing.zoo.animals.herbivore;

import com.ing.zoo.Animal;

public class Hippo extends Animal implements Herbivore{
    public String name;
    public String helloText;
    public String eatText;

    public Hippo(String name) {
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
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
