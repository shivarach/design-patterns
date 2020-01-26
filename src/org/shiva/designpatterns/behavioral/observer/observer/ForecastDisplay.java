package org.shiva.designpatterns.behavioral.observer.observer;

public class ForecastDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public String show() {
        System.out.println(toString());
        return toString();
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        show();
    }

    @Override
    public String toString() {
        return "ForecastDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
