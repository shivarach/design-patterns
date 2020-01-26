package org.shiva.designpatterns.behavioral.iterator;

import java.util.List;

public class CarModelIteratorImpl implements CarModelIterator {
    private List<CarModel> carModels;
    private int counter = 0;

    public CarModelIteratorImpl(List<CarModel> carModels) {
        this.carModels = carModels;
    }

    @Override
    public CarModel nextModel() {
        return carModels.get(counter++);
    }

    @Override
    public boolean isLastModel() {
        return !(counter < carModels.size());
    }
}
