package com.company.concepts;

public class MethodOverloading {

//    method overloading, multiple methods can have the same name with different parameters:

    private String personName;
    private String age;


    MethodOverloading(){

    }

    MethodOverloading(String name){
        System.out.println("a method with one params with same Method Name");
    }

    MethodOverloading(String name, String age){
        this.setPersonName(name);
        this.setAge(age);
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
