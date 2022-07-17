package com.dezzy;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        int n = arr.length;
        for (int i = 1; i< arr.length; i++){
            int value = arr[i]; 
            int hole = i;

            while(hole>0 && arr[hole -1] >value){
                arr[hole] = arr[hole-1];
                hole = hole -1;
            }
            arr[hole] = value;
        }


    }
    public static void main(String[] args){
        int arr[] = {6, 9, 0, 3, 5, 8};
        insertionSort(arr);
        for (int i:arr){
            System.out.print(i + " ");

        }
    }

}
