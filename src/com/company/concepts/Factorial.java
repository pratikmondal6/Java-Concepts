package com.company.concepts;

public class Factorial {

    int fact = 1;

    int Factorial(int number){

        for(int i= number; i >= 1 ; i--){
            fact = fact * i;
        }

        return fact;
    }
}
