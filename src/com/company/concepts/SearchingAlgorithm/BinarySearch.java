package com.company.concepts.SearchingAlgorithm;

import java.util.Calendar;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int item = 5;

        int left, right, middle;
        left =0;
        right = 6;


        while (left<=right) {
            middle = (left + right) / 2;

            if (arr[middle] == item) {
                System.out.println("Found in " + middle);
                return;
            } else if (arr[middle] < item) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        System.out.println("item not found");


    }

}


