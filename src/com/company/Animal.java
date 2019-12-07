package com.company;

public abstract class Animal {
    public String name;
    public String helloText;
    public String eatText;

    /*
    Omdat alle dieren de bovenste drie properties hebben, heb ik die properties bij de Parent class aangemaakt waardoor
    ze weg konden bij de dieren zelf.
     */

    public abstract void sayHello();
}
