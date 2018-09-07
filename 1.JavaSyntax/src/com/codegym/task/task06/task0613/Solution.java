package com.codegym.task.task06.task0613;

/* 
Cat and statics

*/

public class Solution {
    public static void main(String[] args) {
        // create 10 cats
        for (int a=0;a<10;a++){

            Cat cat =new Cat();
            cat=null;
        }

        System.out.print(Cat.catCount);

        // display the value of the variable catCount
    }

    public static class Cat {
        // create a static variable catCount
        public static int catCount;

        // declare a constructor
        public Cat(){
            catCount++;
        }
    }
}
