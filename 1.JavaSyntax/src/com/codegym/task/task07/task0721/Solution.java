package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        int maximum=0;
        int minimum=0;

        //write your code hāāāāerāāeā

        for (int a=0; a<20; a++)
            array[a] = Integer.parseInt(reader.readLine());

        sort(array);

        System.out.print(array[0] + " " + array[19]);
    }


    public static void sort(int[] array) {
        //wrāite your code hereāā
        int max, min;

        for (int a = 0; a < 20; a++)
            for (int b = 0; b < 19; b++) {

                min = Math.min(array[b], array[b + 1]);
                max = Math.max(array[b], array[b + 1]);
                array[b] = max;
                array[b + 1] = min;
            }
    }
}
