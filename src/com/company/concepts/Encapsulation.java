package com.company.concepts;


//Encapsulation in Java is a mechanism
// of wrapping the data (variables) and code acting on the data (methods) together as a single unit
//Benefit
//Data Hiding
//Code reusability

public class Encapsulation {

    private String name;
    private String age;


    public Encapsulation(){

    }

    public Encapsulation(String name, String age){
        this.setName(name);
        this.setAge(age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Encapsulation encapsulation = new Encapsulation("pratik", "18");
        System.out.println(encapsulation.getName() +" is "+ encapsulation.getAge());


    }
}


