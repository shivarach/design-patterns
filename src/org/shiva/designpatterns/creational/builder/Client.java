package org.shiva.designpatterns.creational.builder;

import org.shiva.designpatterns.creational.builder.model.Person;

public class Client {
   /*There is other variation of builder pattern also check
    https://springframework.guru/gang-of-four-design-patterns/builder-pattern/*/
    public static void main(String[] args) {
        final Person person = new PersonBuilder()
                .setFirstName("Siva")
                .setLastName("Rachakonda")
                .setHeight(200)
                .build();

        System.out.println(person);
    }
}
