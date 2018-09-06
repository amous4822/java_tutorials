package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    //write your code here
    private String name;
    private String address;
    private String color;
    private int weight ;
    private int age;

    public Cat(String name){
        this.name=name;
        address=null;
        age=10;
        color="WHITE";
        weight=50;
    }

    public Cat(String name, int weight, int age){
        this.name=name;
        address=null;
        this.age=age;
        color="WHITE";
        this.weight=weight;
    }

    public Cat(String name,int age){
        this.name=name;
        address=null;
        this.age=age;
        color="WHITE";
        weight=50;
    }

    public Cat(int weight,String color){
        this.name=null;
        address=null;
        age=10;
        this.color=color;
        this.weight=weight;
    }

    public Cat(int weight,String color, String address ){
        this.name=null;
        this.address=address;
        age=10;
        this.color=color;
        this.weight=weight;
    }

    public static void main(String[] args) {

    }
}
