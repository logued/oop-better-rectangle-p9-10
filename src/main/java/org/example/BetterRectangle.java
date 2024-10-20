package org.example;

// Exercise P9.10 and P9.11 - partial solution
//

// Import the Rectangle class definition form the Java API
// Look it up in the API documentation (or hover over the word Rectangle)
// and you will see that this Rectangle hs a position (x,y) and width an height
// fields.
import java.awt.Rectangle;


public class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height); // P9.11 -call the constructor in the Rectangle class

//      setLocation(x,y);   // P9.10
//      setSize(width,height);

  }

    public double getArea() {
        return getWidth() * getHeight();
    }

    //TODO
    // Complete the rest of the exercise by adding methods
    // and then testing them in main()
}
