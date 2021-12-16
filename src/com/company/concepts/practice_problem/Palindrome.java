package com.company.concepts.practice_problem;

public class Palindrome {

    public boolean isPalindrome(String input){
        StringBuffer stringBuffer = new StringBuffer(input);
        String reverseInput = stringBuffer.reverse().toString();

        if(input.equals(reverseInput)) {
            return true;
        }else {
            return false;
        }

    }

}
