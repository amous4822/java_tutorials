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
        int minimum;

        //write your code hāāāerāeā

        for (int a=0; a<20; a++)
            array[a] = Integer.parseInt(reader.readLine());

        minimum = array[0];
        for (int a=0; a<20; a++){

            maximum = Math.max(array[a],maximum);
            minimum = Math.min(array[a],minimum);

        }

        System.out.print(maximum + " " + minimum);
    }
}
