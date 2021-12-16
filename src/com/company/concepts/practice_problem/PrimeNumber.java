package com.company.concepts.practice_problem;

public class PrimeNumber {

    public boolean checkPrime(int input){

        boolean prime = true;
        for(int i= 2; i<input; i++){
            if(input % i == 0){
                prime = false;
            }
        }
        return prime;
    }
}
