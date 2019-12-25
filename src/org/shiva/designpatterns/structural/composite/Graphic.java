package org.shiva.designpatterns.structural.composite;

// The component interface declares common operations for both
// simple and complex objects of a composition.
public interface Graphic {

    void move(int x, int y);
    void draw();
}
