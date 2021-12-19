package com.company.concepts.SearchingAlgorithm;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {22, 2, 5, 3, 10};
        int i, j, size = 5;

        for(i=0; i< size-1 ; i++){
            for(j=0; j<size-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

       for(i=0; i<size; i++){
           System.out.println(arr[i]);
       }

    }

}
