package com.dezzy;

public class BubbleSort {
    static void bubbleSort(int [] arr){
        int n = arr.length;
        int temp = 0;   //temporal index to swap elements in the array
        for (int j=0; j<n-1; j++){
            for (int i=0; i<(n-2); i++) {
                if (arr[i] > arr[i+1]){  //comparing the current element to the next element of the array
                    temp = arr[i+1];
                    arr[i+1] =arr[i];
                    arr[i] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = {6,9,0,3,5,8};    // sample array
        bubbleSort(arr);
        for(int j=0; j<arr.length; j++)

        System.out.print(arr[j] + " ");

    }
}
