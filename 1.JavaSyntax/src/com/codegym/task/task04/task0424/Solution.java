package com.codegym.task.task04.task0424;

/* 
Three numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);

        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

        if(num1==num2)
            System.out.print("3");
        if(num1==num3)
            System.out.print("2");
        if(num3==num2)
            System.out.print("1");
    }
}
