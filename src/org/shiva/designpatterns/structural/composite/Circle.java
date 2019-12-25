package org.shiva.designpatterns.structural.composite;

// All component classes can extend other components.
public class Circle extends Dot {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Drawing circle at (%s, %s) with radius %s", x, y , radius));
    }
}
