package com.company.animals;

import com.company.Omnivore;
import com.company.interfaces.Tricks;

import java.util.Random;

public class Pig extends Omnivore implements Tricks {
    public String trick;

    public Pig() {
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
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
