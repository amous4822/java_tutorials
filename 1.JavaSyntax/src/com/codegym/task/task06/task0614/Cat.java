package com.codegym.task.task06.task0614;

import java.util.ArrayList;

/* 
Static cats

*/

public class Cat {
    //write your code here
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
    }

    public static void main(String[] args) {
        //write your code here

        for (int a = 0; a<10; a++){

            Cat cat = new Cat();
            cats.add(cat);
            cat=null;


        }

        printCats();
    }

    public static void printCats() {
        //write your code here


        for (int a = 0; a<10; a++) {
            Cat cat = cats.get(a);
            System.out.println(cat.toString());
        }
    }
}
