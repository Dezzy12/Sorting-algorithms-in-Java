package com.dezzy;

import java.util.Random;
public class MergeSort {
    public static void  mergeSort(int[] arr){
        int n = arr.length;
        if(n < 2){
            return;
        }
        int mid = n /2;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[n - mid];

        for (int i = 0; i < mid; i++){
            arr1[i] = arr[i];
        }
        for (int i = mid; i < n; i++){
            arr2[i - mid] = arr[i];
        }
        mergeSort(arr1);
        mergeSort(arr2);
        merge(arr,arr1,arr2);

    }
    public static void merge(int[] arr, int[] arr1, int[] arr2){
        int leftSize = arr1.length;
        int rightSize = arr2.length;
        int i = 0,j= 0, k = 0;
        while (i < leftSize && j < rightSize){
            if (arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < leftSize){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < rightSize){
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
    private static void printArray(int[] numbers){
        int n = numbers.length;
        for(int i = 0; i < n; i++){
            System.out.print(numbers[i] + " ");
        }
    }
    public static void main(String[] args){
        Random rand = new Random();
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before sorting: ");
        printArray(numbers);

        mergeSort(numbers);
        System.out.println("\n"+"Sorted array: ");
        printArray(numbers);
    }

}
