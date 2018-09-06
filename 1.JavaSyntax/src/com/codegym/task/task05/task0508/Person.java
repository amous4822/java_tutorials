package com.codegym.task.task05.task0508;

/* 
Getters and setters for the Person class

*/

public class Person {
    //write your code here

    protected String name;

    protected int age;
    protected char sex;

    public int getAge(){
        return age;
    }

    public char getSex(){
        return sex;
    }

    public String getName(){
        return name;
    }


    public void setAge(int temp){
        age=temp;
    }

    public void setSex(char temp){
        sex=temp;
    }

    public void setName(String temp){
        name=temp;
    }
//
    public static void main(String[] args) {

    }
}
