package org.shiva.designpatterns.creational.builder.model;

import org.shiva.designpatterns.creational.builder.PersonBuilder;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private String motherName;
    private String fatherName;
    private int height;
    private int weight;

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.getFirstName();
        this.middleName = personBuilder.getLastName();
        this.lastName = personBuilder.getLastName();
        this.motherName = personBuilder.getMotherName();
        this.fatherName = personBuilder.getFatherName();
        this.height = personBuilder.getHeight();
        this.weight = personBuilder.getWeight();
    }

//    public Person(String firstName, String middleName, String lastName, String motherName, String fatherName) {
//        this.firstName = firstName;
//        this.middleName = middleName;
//        this.lastName = lastName;
//        this.motherName = motherName;
//        this.fatherName = fatherName;
//    }
//
//    public Person(String firstName, String middleName, String lastName, String motherName, String fatherName, int height, int weight) {
//        this.firstName = firstName;
//        this.middleName = middleName;
//        this.lastName = lastName;
//        this.motherName = motherName;
//        this.fatherName = fatherName;
//        this.height = height;
//        this.weight = weight;
//    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
