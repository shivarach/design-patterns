package org.shiva.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class CarModelAggregateImpl implements CarModelAggregate {

    List<CarModel> carModels = new ArrayList<>();
    @Override
    public void addModel(CarModel carModel) {
        carModels.add(carModel);
    }

    @Override
    public void removeModel(CarModel carModel) {
        carModels.remove(carModel);
    }

    @Override
    public CarModelIterator getModelIterator() {
        return new CarModelIteratorImpl(carModels);
    }
}
