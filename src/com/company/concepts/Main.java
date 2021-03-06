package com.company.concepts;

import com.company.concepts.practice_problem.EvenOrOdd;
import com.company.concepts.practice_problem.Factorial;
import com.company.concepts.practice_problem.Palindrome;
import com.company.concepts.practice_problem.PrimeNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a positive number");
        int inputNum  = scanner.nextInt();
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        boolean numStatus = evenOrOdd.evenOddChecker(inputNum);
        if(numStatus){
            System.out.println(+inputNum +" is even");
        }else {
            System.out.println(+inputNum +" is odd");
        }

     // factorial

        Factorial factorial = new Factorial();
        int fact = factorial.Factorial(inputNum);
        System.out.println("factorial of "+inputNum+ " is "+fact);

    //  prime

        PrimeNumber primeNumber = new PrimeNumber();
        boolean prime = primeNumber.checkPrime(inputNum);
        if(prime) {
            System.out.println(inputNum + " is a prime number");
        }else {
            System.out.println(inputNum + " is not a prime number");
        }

//        palindrome

        Palindrome palindrome = new Palindrome();
        System.out.println("Input any to check palindrome");
        String input = scanner.next();
        palindrome.isPalindrome(input);
        if(palindrome.isPalindrome(input)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }



    }
}
