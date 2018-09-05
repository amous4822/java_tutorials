package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {


        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //write your code here

       int sum=0;

       for(int i=number; i>0; i= i/10){
           sum = sum + (i%10);

       }

       return sum;
    }
}