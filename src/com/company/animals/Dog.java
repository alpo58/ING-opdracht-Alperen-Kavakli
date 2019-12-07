package com.company.animals;

import com.company.Omnivore;
import com.company.interfaces.Tricks;

import java.util.Random;

public class Dog extends Omnivore implements Tricks {

    @Override
    public void eatLeaves() {
        System.out.println("Woof woof, sh*t, these are not leaves, its.... WEED *gets high*");
    }

    @Override
    public void eatMeat() {
        System.out.println("This some good meat bro, yummmm");
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
        System.out.println("Woof woof wazzup motherf*ckers");
    }

    @Override
    public void performTrick() {
        System.out.println("does 360 no scope on Call of Duty");
    }
}
