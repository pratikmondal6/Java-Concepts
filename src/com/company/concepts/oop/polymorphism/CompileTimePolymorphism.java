package com.company.concepts.oop.polymorphism;

//method overloading is CompileTimePolymorphism

public class CompileTimePolymorphism {

    private String personName;
    private String age;


    CompileTimePolymorphism(){

    }

    void setPersonDetails(String name){
        System.out.println("a method with one params with same Method Name");
    }

    void setPersonDetails(String name, String age){
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


    public static void main(String[] args) {

        CompileTimePolymorphism compileTimePolymorphism = new CompileTimePolymorphism();
        compileTimePolymorphism.setPersonDetails("Pratik");
        compileTimePolymorphism.setPersonDetails("Pratik","18");
        System.out.println(compileTimePolymorphism.getPersonName()+ " "+ compileTimePolymorphism.getAge());

    }
}
