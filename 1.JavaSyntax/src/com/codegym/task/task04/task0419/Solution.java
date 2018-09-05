package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

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
        int num4=input.nextInt();

        if(num1>=num2)
            if(num1>=num3)
                if(num1>=num4)
                    System.out.println(num1);
                else
                    System.out.println(num4);
            else if(num3>=num4)
                System.out.println(num3);
            else
                System.out.println(num4);

        else {
            if (num2 >=num3)
                if (num2 >= num4)
                    System.out.println(num2);
                else
                    System.out.println(num4);
            else if (num3 >= num4)
                System.out.println(num3);
            else
                System.out.println(num4);

        }


    }
}
