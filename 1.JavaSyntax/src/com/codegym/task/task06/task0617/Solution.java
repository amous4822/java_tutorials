package com.codegym.task.task06.task0617;

/* 
Notepad for new ideas
ā
*/

public class Solution {
    public static void main(String[] args) {

        Idea idea= new Idea();
       // printIdea(idea);
    }

    public static class Idea{

        public String getDescription(){
            return "hi sample";
        }

    }

    public static void printIdea(Idea idea){

        System.out.print(idea.getDescription());

    }


    //write your code here
}
