package com.company;

public abstract class Omnivore extends Animal {
    public abstract void eatLeaves();
    public abstract void eatMeat();

    // This method makes the omnivore eat something random between meat and leaves.
    public abstract void eatRandom();
}
