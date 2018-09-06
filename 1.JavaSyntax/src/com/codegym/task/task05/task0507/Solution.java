package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input=new Scanner(System.in);
        int flag=-1;
        double sum=0;

        for (int a=0;a!=-1;){

            flag++;
            sum=sum+a;
            a=input.nextInt();
        }

        System.out.println(sum/flag);

    }
}

