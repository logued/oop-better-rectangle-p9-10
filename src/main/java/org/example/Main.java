package org.example;

import java.awt.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(1,1,5,3);
        System.out.println(r);

        BetterRectangle betterRectangle = new BetterRectangle(2,2,5,7);
        System.out.println(betterRectangle.getArea());


    }
}
