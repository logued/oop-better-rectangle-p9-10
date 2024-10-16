package org.example;

// You must import this class from the Java Standard Library
// Look up the class in the Java API
// You are going to extend this class (inherit from)
// and add methods.

import java.awt.Rectangle;

// Partial solution (starter) to the P9.10 Exercise

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(1,1,5,3);
        System.out.println(r);

        BetterRectangle betterRectangle = new BetterRectangle(2,2,5,7);
        System.out.println(betterRectangle.getArea());

        // Complete the rest of the exercise

    }
}
