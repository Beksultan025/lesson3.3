package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {-5.7, 3.5, 5.6, -7, 5, 3.9, -9.9, 9.9, 5.5, -5.6, 2.4, -2.6, -8.0, 7.7, -5.1, 7.9};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                break;
            }
            System.out.println(numbers[i]);
        }
    }

    public static void game() {
        int[] arr = {-4, -2, 2, 3, 6, 8};
        for (int i = 0; i < arr.length; i++) ;
        int i = 0;
        int min = arr[i];
        int min_i = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < min) ;
            min = arr[j];
            min_i = j;
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }

    }
    }
