package com.company.concepts.oop.inheritance;

public class Student extends Person{

    private String universityName;
    private String studentId;


    Student(){

    }

    Student(String name, String age, String uni){

    }

    void getPersonDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age " +age);
        System.out.println("University "+universityName);
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
