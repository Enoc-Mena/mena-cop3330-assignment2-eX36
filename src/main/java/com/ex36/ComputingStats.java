/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex36;

import java.util.Scanner;

public class ComputingStats {

    public static void average(int[] arr, int n) {

        int total = 0;

        for(int i = 0; i < n; i++) {

            total +=  arr[i];

        }

        int avg = total / n;

        System.out.println("The average is: " + avg);

    }

    public static void min(int[] inputArray) {

        int minValue = inputArray[0];

        for(int i=1;i<inputArray.length;i++){

            if(inputArray[i] < minValue){

                minValue = inputArray[i-1];

            }

        }

        System.out.println("The minimum value is: " + minValue);

    }

    public static void max(int[] inputArray) {

        int maxValue = inputArray[0];

        for(int i=1;i < inputArray.length;i++){

            if(inputArray[i] > maxValue){

                maxValue = inputArray[i];

            }

        }

        System.out.println("The maximum value is: " + maxValue);

    }

    public static double std(int numArray[]) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;

        for(double num : numArray) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        System.out.println("Standard deviation is: " + Math.sqrt(standardDeviation/length));

        return 0;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] array = new int[1000];
        int n = array.length;

        for(int i = 0; i < n; i++) {

            System.out.print("Enter a number (Enter -1 to exit): ");
            array[i] = s.nextInt();

            if(array[i] == -1) {

                break;

            }

        }

        average(array,n);
        min(array);
        max(array);
        std(array);

    }

}
