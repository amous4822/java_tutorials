package com.codegym.task.task05.task0504;


/* 
The Three "Muscateers"

*/

public class Solution {
    public static void main(String[] args) {

        //write your code here

        Cat cat1 = new Cat("tom",20,60,300);
        Cat cat2 = new Cat("maven",15,40,200);
        Cat cat3 = new Cat("Vivienne",30,80,1000);

        //āḥ
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}