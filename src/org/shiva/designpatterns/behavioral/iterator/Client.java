package org.shiva.designpatterns.behavioral.iterator;

public class Client {
    /*
    Provide a way to access the elements of an aggregate object sequentially without
exposing its underlying representation
     */
    public static void main(String[] args) {
        final CarModelAggregate carModelAggregate = new CarModelAggregateImpl();
        carModelAggregate.addModel(new CarModel("Sedan", "Honda City"));
        carModelAggregate.addModel(new CarModel("Sedan", "Hyundai Verna"));
        carModelAggregate.addModel(new CarModel("Sedan", "Skoda Rapid"));

        final CarModelIterator modelIterator = carModelAggregate.getModelIterator();
        while (!modelIterator.isLastModel()) {
            System.out.println(modelIterator.nextModel());
        }
    }
}
