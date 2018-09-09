package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String temp;
        int max=0;

        for (int a =0; a<5; a++){

            temp = input.readLine();
            strings.add(temp);

            if(strings.get(a).length() > max)
                max = strings.get(a).length();

        }

        for (int a =0; a<5; a++)
            if(strings.get(a).length() == max)
                System.out.println(strings.get(a));

    }
}
