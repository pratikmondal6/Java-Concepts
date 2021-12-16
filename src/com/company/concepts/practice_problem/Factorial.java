package com.company.concepts.practice_problem;

public class Factorial {

    int fact = 1;

    public int Factorial(int number){

        for(int i= number; i >= 1 ; i--){
            fact = fact * i;
        }

        return fact;
    }
}
