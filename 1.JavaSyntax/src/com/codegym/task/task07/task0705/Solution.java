package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);
        int[] large = new int[20];
        int[] s1 = new int[10];
        int[] s2 = new int[10];

        for (int a=0; a<20; a++)
            large[a] = input.nextInt();

        for (int a=0; a<10; a++)
            s1[a] = large[a];

        for (int a=0, b=10; a<10; a++, b++)
            s2[a] = large[b];

        for (int a=0; a<10; a++)
            System.out.println(s2[a]);

        //
    }
}
