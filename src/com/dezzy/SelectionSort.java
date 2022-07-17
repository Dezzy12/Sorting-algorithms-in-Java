package com.dezzy;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            int min = i;    // set min as the starting index
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[j] < arr[min])      //searching for the minimum element in the array
                    min = j;       //min value becomes the minimum
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 9, 0, 3, 5, 8}; //sample array
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }


    }
}
