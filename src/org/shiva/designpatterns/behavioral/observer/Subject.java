package org.shiva.designpatterns.behavioral.observer;

import org.shiva.designpatterns.behavioral.observer.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void notifyObservers();
}
