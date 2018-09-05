package com.codegym.task.task04.task0414;

/* 
Number of days in a year

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        BufferedReader input= new BufferedReader( new InputStreamReader( System.in));
        String s = input.readLine();
        int num = Integer.parseInt(s);

        if( ( num%4 ==0 && num%100!=0 ) || num%400==0 )
            System.out.println("Number of days in a year: 366");

        else
            System.out.println("Number of days in a year: 365");



    }
}