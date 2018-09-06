package com.codegym.task.task04.task0433;


/* 
Seeing dollars in your future

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int a=10,b=10;

        while(a!=0){
            while(b!=0){
                System.out.print("$");
                b--;
            }
            System.out.println("");
            b=10;
            a--;
        }
    }
}
