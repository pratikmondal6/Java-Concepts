package com.company.concepts;

public class Palindrome {

    boolean isPalindrome(String input){
        StringBuffer stringBuffer = new StringBuffer(input);
        String reverseInput = stringBuffer.reverse().toString();

        if(input.equals(reverseInput)) {
            return true;
        }else {
            return false;
        }

    }

}
