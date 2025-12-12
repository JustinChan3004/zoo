package com.ing.zoo.animals.carnivore;

import com.ing.zoo.Animal;

public class Lion extends Animal implements Carnivore {
    public String name;
    public String helloText;
    public String eatText;

    public Lion(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
