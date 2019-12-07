package com.company.animals;

import com.company.Herbivore;
import com.company.interfaces.Tricks;

public class Zebra extends Herbivore implements Tricks {
    public String trick;

    public Zebra() {
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        trick = "does a backflip";
        System.out.println(trick);
    }
}
