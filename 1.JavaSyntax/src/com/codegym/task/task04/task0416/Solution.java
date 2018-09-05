package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();

        if(num%3==0)
            System.out.println("yellow");

        else if(num%3==2)
            System.out.println("red");

        else
            System.out.println("green");
    }
}