package com.company.concepts.oop.polymorphism.RunTimePolymorphism;

public class Student extends Person {

    String universityName;

    Student(){

    }

    @Override
    void getPersonDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: " +age);
        System.out.println("University: "+universityName);
    }


    public static void main(String[] args) {

        Person p = new Person();
        p.getPersonDetails();

        Person s = new Student();
        s.getPersonDetails();

    }
}
