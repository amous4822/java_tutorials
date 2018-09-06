package com.codegym.task.task04.task0436;


/* 
Drawing a reāctangle

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input= new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();

        for(;num1!=0;num1--){
            for(int a=num2;a!=0;a--)
                System.out.print("8");
            System.out.print("\n");

        }



    }
}
