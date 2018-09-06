package com.codegym.task.task04.task0434;


/* 
Multipālication table

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int a=1,b=1;
        while(a<=10){
            while(b<=10){
                System.out.print(a*b+" ");
                b++;
            }
            System.out.print("\n");
            b=1;
            a++;

        }

    }
}
