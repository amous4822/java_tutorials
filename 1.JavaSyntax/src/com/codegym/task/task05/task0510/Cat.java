package com.codegym.task.task05.task0510;

/* 
Initializing cats

Name,ā
- Name, weight, age
- Name, age (standard weight)
- Weight, color (unknown name, address and age, i.e. a homeless cat)
- Weight, color, address (someone else's pet)

*/

public class Cat {
    //write your code here
    private String name;
    private String address;
    private String color;
    private int weight ;
    private int age;

    public void initialize(String name){
        this.name=name;
        address=null;
        age=10;
        color="WHITE";
        weight=50;
    }

    public void initialize(String name, int weight, int age){
        this.name=name;
        address=null;
        this.age=age;
        color="WHITE";
        this.weight=weight;
    }

    public void initialize(String name,int age){
        this.name=name;
        address=null;
        this.age=age;
        color="WHITE";
        weight=50;
    }

    public void initialize(int weight,String color){
        this.name=null;
        address=null;
        age=10;
        this.color=color;
        this.weight=weight;
    }

    public void initialize(int weight,String color, String address ){
        this.name=null;
        this.address=address;
        age=10;
        this.color=color;
        this.weight=weight;
    }

    public static void main(String[] args) {

    }
}
