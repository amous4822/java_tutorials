package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> list = new ArrayList<>();

        list.add("Sam");
        list.add("I");
        list.add("Am");
        list.add(1,"Ham");
        list.add(3,"Ham");
        list.add(5,"Ham");

        for (int a=0; a<=list.size()-1; a++)
            System.out.println(list.get(a));

    }
}
