package org.example;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

}
