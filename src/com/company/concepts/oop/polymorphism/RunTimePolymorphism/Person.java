package com.company.concepts.oop.polymorphism.RunTimePolymorphism;


public class Person {

    String name;
    String age;

    public Person() {

    }

    public Person setPerson(String name, String age){
        this.name = name;
        this.age = age;
        return this;
    }

    void getPersonDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age " +age);
    }

}


