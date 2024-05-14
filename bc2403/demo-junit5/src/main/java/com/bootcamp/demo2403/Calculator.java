package com.bootcamp.demo2403;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Calculator 
{
   
    public static int sum(int n1, int n2) {
        return n1 + n2;
    }
        
    public static int subtract(int n1, int n2) {
        return n1 - n2;
    }

    public static void sort(int[] arr) {
        int temp = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if ( arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
    }

  
}
