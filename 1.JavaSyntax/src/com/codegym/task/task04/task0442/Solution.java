package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input=new Scanner(System.in);
        int sum=0;

        for (int a=0;a!=-1;){

            sum =sum+a;
            a=input.nextInt();

        }

        sum--;
        System.out.print(sum);


    }
}
