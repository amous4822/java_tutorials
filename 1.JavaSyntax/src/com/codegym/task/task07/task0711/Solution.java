package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert
ā
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for (int a=0; a<5; a++)
            strings.add(input.readLine());

        for (int a=0; a<13; a++)
            strings.add(0,strings.remove(4));

        for (int a=0; a<5; a++)
            System.out.println(strings.get(a));

    }
}
