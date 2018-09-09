package com.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Maximum in an array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // Create and populate the array
        Scanner input= new Scanner(System.in);
        int[] num = new int[20];

        for (int a=0; a<20; a++)
            num[a] = input.nextInt();

        return num;
    }


    public static int max(int[] array) {
        // Find the maximum
        int max=array[0];
        for (int a=1; a<20; a++)
            if(array[a]>max)
                max=array[a];

        return max;
    }
}
