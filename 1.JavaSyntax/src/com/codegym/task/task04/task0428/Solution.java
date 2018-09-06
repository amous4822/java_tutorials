package com.codegym.task.task04.task0428;

/* 
Positive number

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
        int a=0;

        if(num1>0)
            a++;

        if(num2>0)
            a++;

        if(num3>0)
            a++;

        System.out.print(a);
    }
}
