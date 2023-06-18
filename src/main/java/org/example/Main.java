package org.example;

import java.util.Arrays;

public class Main {

    public static int kadane(int[] arr) {

        //O(n)
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int i : arr) {
            maxEndingHere +=i;
            maxEndingHere = Integer.max(maxEndingHere, i);
            maxSoFar = Integer.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr1 = {-8, -3, -6, -2, -5, -4};
        System.out.println(kadane(arr));
        System.out.println(kadane(arr1));
    }
}