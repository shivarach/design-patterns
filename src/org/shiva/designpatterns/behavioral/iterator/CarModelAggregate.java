package org.shiva.designpatterns.behavioral.iterator;

public interface CarModelAggregate {

    void addModel(CarModel carModel);
    void removeModel(CarModel carModel);
    CarModelIterator getModelIterator();

}
