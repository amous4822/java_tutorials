package com.codegym.task.task04.task0418;

/* 
Minimum of two numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        //BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2= input.nextInt();

        if(num1>num2)
            System.out.print(num2);

        else if(num1==num2)
            System.out.print(num2);

        else
            System.out.print(num1);

    }
}