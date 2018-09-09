package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code herāeā
        Scanner input =new Scanner(System.in);
        int[] num = new int[10];

        for (int a = 0; a < 10; a++)
            num[a]= input.nextInt();

        for (int a = 9; a >= 0; a--)
            System.out.println(num[a]);


    }
}

