package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner inout=new Scanner(System.in);
        int num1=inout.nextInt();
        int num2=inout.nextInt();
        int num3=inout.nextInt();

        int a=0,b=0;

        if(num1>0)
            a++;

        else if(num1<0)
            b++;

        if(num2>0)
            a++;
        else if(num2<0)
            b++;

        if(num3>0)
            a++;
        else if (num3<0)
            b++;

        System.out.println("Number of negative numbers: "+b+"\nNumber of positive numbers: "+a);


    }
}
