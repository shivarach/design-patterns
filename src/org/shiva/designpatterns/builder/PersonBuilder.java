package org.shiva.designpatterns.builder;

import org.shiva.designpatterns.builder.model.Person;

public class PersonBuilder {
    private String firstName;
    private String middleName;
    private String lastName;
    private String motherName;
    private String fatherName;
    private int height;
    private int weight;

    public PersonBuilder() {
    }

    public Person build() {
        return new Person(this);
    }

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public PersonBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public PersonBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public PersonBuilder setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }


}
