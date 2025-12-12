package com.ing.zoo;

/**
 * Abstract class for all animals in the zoo
 *
 * Every animal has a name and must be able to say hello in its own way
 *
 * @author Loc Yin Justin Chan
 */
public abstract class Animal {
    /**
     *
     */
    protected String name;

    /**
     * Creates a new aniomal with their given name
     * @param name the name of the animal
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Makes the animal say hello
     */
    public abstract void sayHello();
}
