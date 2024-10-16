package org.example;

// Exercise P9.10 - partial solution
//

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    //TODO
    // Complete the rest of the exercise by adding methods
    // and then testing them in main()
}
