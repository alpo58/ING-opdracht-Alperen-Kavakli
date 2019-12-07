package com.company.animals;

import com.company.Omnivore;

import java.util.Random;

public class Wolf extends Omnivore {

    @Override
    public void eatLeaves() {
        System.out.println("howl, gimme some leaves");
    }

    @Override
    public void eatMeat() {
        System.out.println("Howl, wants meat *shreds deer*");
    }

    @Override
    public void eatRandom() {
        Random random = new Random();
        if (random.nextBoolean()) {
            eatMeat();
        } else {
            eatLeaves();
        }
    }

    @Override
    public void sayHello() {
        System.out.println("Howl, I'm a wolf");
    }
}
