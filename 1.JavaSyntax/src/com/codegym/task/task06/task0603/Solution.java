package com.codegym.task.task06.task0603;

/* 
Cat and Dog objects: 50,000 each

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here

        for(int a=1;a<=500000000;a++){

            Dog dog=new Dog();
            Cat cat=new Cat();

            dog=null;
            cat=null;

        }

    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Dog was destroyed");
    }
}
