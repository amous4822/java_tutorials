package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        Scanner input = new Scanner(System.in);
        int[] large = new int[15];
        int side1=0 , side2=0;

        for (int a=0; a<15; a++) {

            large[a] = input.nextInt();

            if(a%2==0)
                side1 += large[a];

            else
                side2 += large[a];
        }

        if (side1<side2)
            System.out.print("Odd-numbered houses have more residents.");

        else
            System.out.print("Even-numbered houses have more residents.");

    }
}
