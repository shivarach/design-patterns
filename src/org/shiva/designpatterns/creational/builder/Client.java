package org.shiva.designpatterns.creational.builder;

import org.shiva.designpatterns.creational.builder.model.Person;

public class Client {
    public static void main(String[] args) {
        final Person person = new PersonBuilder()
                .setFirstName("Siva")
                .setLastName("Rachakonda")
                .setHeight(200)
                .build();

        System.out.println(person);
    }
}
