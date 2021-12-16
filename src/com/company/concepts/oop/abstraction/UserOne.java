package com.company.concepts.oop.abstraction;

public class UserOne extends MobileUser{

    @Override
    void sendMessage() {
        System.out.println("User One sends a text message");
    }

    public static void main(String[] args) {

        MobileUser mobileUser;   //ref variable
        mobileUser = new UserOne();
        mobileUser.call();
        mobileUser.sendMessage();

        mobileUser = new UserTwo();
        mobileUser.sendMessage();
    }


}
