package com.dezzy;

public class SumNature {
    // program calculates the sum of the first 10 natural number
    public static int natureNum(){
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
       // System.out.println("Sum of natural number: " + natureNum());
        sumNumber();

    }
    public static void sumNumber(){
        int result = 0;
        for(int j = 1   ; j< 10; j++){
            result+= j;
            System.out.println("Sum : " + result);
        }

    }
}
