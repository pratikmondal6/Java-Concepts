package com.company.concepts.SearchingAlgorithm;

import java.util.Scanner;

public class LinearSearch {


    public static void main(String[] args) {

        int[] myNum = {10, 20, 30, 40};

        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        boolean found = false;

        for(int i= 1; i<myNum.length; i++){
            
            if(val == myNum[i]){
                System.out.println("Number found in " +(i+1)+ " position");
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("not found");
        }




    }

}
