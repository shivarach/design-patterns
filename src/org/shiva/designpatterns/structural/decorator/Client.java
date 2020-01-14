package org.shiva.designpatterns.structural.decorator;

import org.shiva.designpatterns.structural.decorator.bouquet.FlowerBouquet;
import org.shiva.designpatterns.structural.decorator.bouquet.RoseBouquet;
import org.shiva.designpatterns.structural.decorator.decorator.PaperWrapper;
import org.shiva.designpatterns.structural.decorator.decorator.RibbonBow;

public class Client {
    /*
    Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative
    to subclassing for extending functionality
     */
    public static void main(String[] args) {
        /*Rose bouquet with no decoration*/
        final FlowerBouquet roseBouquet = new RoseBouquet();
        System.out.println(roseBouquet.getDescription() + " " + roseBouquet.cost());

        /*Rose bouquet with paper wrapper and ribbon bow*/
        FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
        decoratedRoseBouquet = new PaperWrapper(decoratedRoseBouquet);
        decoratedRoseBouquet = new RibbonBow(decoratedRoseBouquet);

        System.out.println(decoratedRoseBouquet.getDescription() + " " + decoratedRoseBouquet.cost());
    }
}
