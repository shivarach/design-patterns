package org.shiva.designpatterns.structural.composite;

// The leaf class represents end objects of a composition. A
// leaf object can't have any sub-objects. Usually, it's leaf
// objects that do the actual work, while composite objects only
// delegate to their sub-components.
public class Dot implements Graphic {

    protected int x;
    protected int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(String.format("Moved to (%s, %s)", x, y));
    }

    @Override
    public void draw() {
        System.out.println(String.format("Drawing dot at (%s, %s)", x, y));
    }
}
