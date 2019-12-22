package org.shiva.designpatterns.creational.singleton;

public class SingletonClass {

    private static SingletonClass instance;

    private SingletonClass() {
    }

    // lazy initialization
    static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    // thread safe
    public synchronized static SingletonClass getThreadSafeInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    void sayHello() {
        System.out.println("Hello from singleton");
    }


}
