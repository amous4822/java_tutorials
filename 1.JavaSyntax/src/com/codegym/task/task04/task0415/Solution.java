package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s=input.readLine();
        int num1 = Integer.parseInt(s);
        s=input.readLine();
        int num2 = Integer.parseInt(s);
        s=input.readLine();
        int num3 = Integer.parseInt(s);

        if(num1+num2>num3 && num1+num3>num2 && num2+num3>num1)
            System.out.println("The triangle is possible.");

        else
            System.out.println("The triangle is not possible.");



    }
}