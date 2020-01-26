package org.shiva.designpatterns.behavioral.observer;

import org.shiva.designpatterns.behavioral.observer.observer.CurrentConditionsDisplay;
import org.shiva.designpatterns.behavioral.observer.observer.ForecastDisplay;

public class Client {
    public static void main(String[] args) {
        final WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new CurrentConditionsDisplay());
        weatherData.registerObserver(new ForecastDisplay());

        weatherData.updateReadings(30, 80, 100);
    }
}
