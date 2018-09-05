package com.codegym.task.task04.task0402;

/* 
Price of apples

*/
public class Solution {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("The cost of apples is " + Apple.applesPrice);
    }

    public static class Apple {

        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {
            //write your code here
            Apple.applesPrice += applesPrice;
        }
    }
}
