package org.shiva.designpatterns.structural.proxy;

public class Client {
    public static void main(String[] args) throws Exception {
        /*
        Provide a surrogate or placeholder for another object to control access to it
         */
        final Internet internet = new ProxyInternet();
        internet.connect("abc.com");
    }
}
