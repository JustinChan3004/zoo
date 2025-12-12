package com.ing.zoo.animals.carnivore;

import com.ing.zoo.Animal;

public class Wolf extends Animal implements Carnivore {
    public String name;
    public String helloText;
    public String eatText;

    public Wolf(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "awoooo";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom";
        System.out.println(eatText);
    }
}
