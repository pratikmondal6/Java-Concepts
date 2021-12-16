package com.company.concepts.others;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapAndSet {


    public static void main(String[] args) {
        HashMap<Integer, String> customer = new HashMap<>();

        customer.put(1, "pratik");
        customer.put(2, "pulak");

        System.out.println(customer.get(1));


//        no duplicate element in Hashset

        HashSet<String> fruitsName = new HashSet<>();

        fruitsName.add("mango");
        fruitsName.add("bananananaaa");


        System.out.println(fruitsName);

//        remove, isEmpty, clear


    }


}
