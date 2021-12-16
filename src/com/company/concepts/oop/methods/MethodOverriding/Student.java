package com.company.concepts.oop.methods.MethodOverriding;

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

       Student student = new Student();
       student.setPerson("pratik", "18");
       student.universityName = "AIUB";
       student.getPersonDetails();
    }
}
