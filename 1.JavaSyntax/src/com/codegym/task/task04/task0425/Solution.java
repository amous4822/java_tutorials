package com.codegym.task.task04.task0425;

/* 
Target locked!

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        Scanner input = new Scanner(System.in);

        int num1=input.nextInt();
        int num2=input.nextInt();

        if(num1>0 && num2>0)
            System.out.println("1");

        if(num1<0 && num2>0)
            System.out.println("2");

        if(num1<0 && num2<0)
            System.out.println("3");

        if(num1>0 && num2<0)
            System.out.println("4");


    }
}
