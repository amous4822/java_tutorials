package com.codegym.task.task04.task0409;

/* 
Closest to 10

*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(7, 14);
    }

    public static void closeToTen(int a, int b) {
        //write your code here
        if(abs(a-10) > abs(b-10))
            System.out.println(b);

        else
            System.out.println(a);
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}