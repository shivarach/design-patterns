package org.shiva.designpatterns.structural.composite;

public class Client {
    /*
    Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients
    treat individual objects and compositions of objects uniformly
     */
    public static void main(String[] args) {
        final CompoundGraphic compoundGraphic = new CompoundGraphic();
        compoundGraphic.addGraphic(new Dot(0, 0));
        compoundGraphic.addGraphic(new Circle(0, 0, 5));

        compoundGraphic.move(1, 1);
        compoundGraphic.draw();
    }
}
