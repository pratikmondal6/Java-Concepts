package com.company.concepts.DataStructure;

import java.util.LinkedList;

public class LinkedListStructure {

    public static void main(String[] args) {
        LinkedList<String> country = new LinkedList<>();

        country.add("Bangladesh");
        country.add("India");
        country.add("Japan");

        country.add(2,"Australia");
        country.addFirst("Dubai");
        country.addLast("US");

        country.remove(3);

        for (String name : country){
            System.out.println(name);
        }



    }






}
