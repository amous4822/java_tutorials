package com.codegym.task.task05.task0502;

/* 
Implement the fight methodāāḥḥ

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //write your code here
        if(strength<=anotherCat.strength){

            if(weight<anotherCat.weight)
                return false;

            else if(age<anotherCat.age)
                return true;
        }

        else{

            if(weight>anotherCat.weight)
                return true;

            else if(age>anotherCat.age)
                return false;

        }

        return true;

    }

    public static void main(String[] args) {

        Cat cat1=new Cat();
        cat1.age=40;
        cat1.strength=50;
        cat1.weight=100;

        Cat cat2=new Cat();
        cat2.age=40;
        cat2.strength=50;
        cat2.weight=100;

    }
}
