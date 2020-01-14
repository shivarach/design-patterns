package org.shiva.designpatterns.structural.proxy;

public class Client {
    public static void main(String[] args) throws Exception {

        final Internet internet = new ProxyInternet();
        internet.connect("abc.com");
    }
}
