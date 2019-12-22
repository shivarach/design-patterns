package org.shiva.designpatterns.creational.singleton;

public class Client {
    public static void main(String[] args) {
        final SingletonClass instance = SingletonClass.getInstance();
        instance.sayHello();
    }
}
