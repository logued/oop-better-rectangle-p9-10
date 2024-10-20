package org.example;

// You must import this Rectangle class from the Java Standard Library.
// Look up the class in the Java API to see its fields and methods.
// You are going to extend this class (inherit from)
// and add methods.

import java.awt.Rectangle;

// Partial solution (starter) to the P9.10 ,9.11 Exercise

public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(1,1,5,3);
        System.out.println(r);

        BetterRectangle betterRectangle = new BetterRectangle(2,2,5,7);
        System.out.println(betterRectangle.getArea());

        // Complete the rest of the exercise - write and call getPerimeter()

    }
}
