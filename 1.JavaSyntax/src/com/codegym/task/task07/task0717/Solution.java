package com.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplicating words

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList hereā
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int a=0; a<10; a++)
            list.add(input.readLine());

        ArrayList<String> result = doubleValues(list);

        for (String s: list)
            System.out.println(s);

        // Display result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //write your code hereā
        for (int a=0; a<list.size(); a++)
            list.add(a+1, list.get(a++));

        return list;
    }
}
