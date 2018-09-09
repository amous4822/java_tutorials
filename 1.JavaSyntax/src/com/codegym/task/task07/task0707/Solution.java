package com.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
What sort of list is that?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        list.add("hell");
        list.add("hel");
        list.add("he");
        list.add("h");

        System.out.println(list.size());

        for (int a=0; a<5; a++)
            System.out.println(list.get(a));
    }
}
